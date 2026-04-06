package pattern.factory;
import model.User;
import model.Student; 
import model.Faculty;
import model.Guest;
import model.Researcher;
import model.HeadLabCoordinator;
import model.LabManager;;

public class UserFactory {

    public UserFactory () {}

    public User getUserType(String userType) {
        if (userType.equals("STUDENT")) {
            return new Student();
        }
        else if (userType.equals("GUEST")) {
            return new Guest(); 
        }

        else if (userType.equals("RESEARCHER")) {
            return new Researcher();
        }

        else if (userType.equals("FACULTY")) {
            return new Faculty();
        }

        else if (userType.equals("COORDINATOR")) {
            return new HeadLabCoordinator();
        }

        else if (userType.equals("MANAGER")) {
            return new LabManager();
        }
        else {
            return null;
        }
    }
}
