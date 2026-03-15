package data;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import model.*;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * UserDAO - loads and saves users from/to users.csv
 * CSV columns: userID,name,email,password,userType,staffID,status,department
 */
public class UserDAO {

    private String path;
    private List<User> users = new ArrayList<>();

    public UserDAO(String path) {
        this.path = path;
    }

    public void load() throws Exception {
        users.clear();
        CsvReader reader = new CsvReader(path);
        reader.readHeaders();

        while (reader.readRecord()) {
            String userType = reader.get("userType");
            User user = createUser(userType);

            user.setUserID(reader.get("userID"));
            user.setName(reader.get("name"));
            user.setEmail(reader.get("email"));
            user.setPassword(reader.get("password"));
            user.setUserType(userType);
            user.setStaffID(reader.get("staffID"));
            user.setStatus(reader.get("status"));
            user.setDepartment(reader.get("department"));

            users.add(user);
        }
        reader.close();
    }

    public void save() throws Exception {
        CsvWriter writer = new CsvWriter(new FileWriter(path, false), ',');

        // Write headers
        writer.write("userID");
        writer.write("name");
        writer.write("email");
        writer.write("password");
        writer.write("userType");
        writer.write("staffID");
        writer.write("status");
        writer.write("department");
        writer.endRecord();

        // Write each user
        for (User u : users) {
            writer.write(u.getUserID());
            writer.write(u.getName());
            writer.write(u.getEmail());
            writer.write(u.getPassword());
            writer.write(u.getUserType());
            writer.write(u.getStaffID());
            writer.write(u.getStatus());
            writer.write(u.getDepartment());
            writer.endRecord();
        }
        writer.close();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public User findByEmail(String email) {
        for (User u : users) {
            if (u.getEmail().equalsIgnoreCase(email)) return u;
        }
        return null;
    }

    public User findByID(String userID) {
        for (User u : users) {
            if (u.getUserID().equals(userID)) return u;
        }
        return null;
    }

    public boolean emailExists(String email) {
        return findByEmail(email) != null;
    }

    public List<User> getAllUsers() {
        return users;
    }

    public void updateUser(User updated) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUserID().equals(updated.getUserID())) {
                users.set(i, updated);
                return;
            }
        }
    }

    // Factory helper - creates the right subclass based on userType string
    private User createUser(String userType) {
        switch (userType.toUpperCase()) {
            case "STUDENT":    return new Student();
            case "FACULTY":    return new Faculty();
            case "RESEARCHER": return new Researcher();
            case "GUEST":      return new Guest();
            case "MANAGER":    return new LabManager();
            case "COORDINATOR": return new HeadLabCoordinator();
            default:           return new Student();
        }
    }
}
