package pattern.singleton;

import model.LabManager;

/**
 * Singleton Pattern - HeadLabCoordinator
 * Only one Head Lab Coordinator exists in the system (Req2).
 * Only this instance can generate manager accounts.
 */
public class HeadLabCoordinatorSingleton {

    private static HeadLabCoordinatorSingleton instance;

    private String coordinatorID;
    private String name;
    private String email;
    private String department;

    // Private constructor - nobody can instantiate this directly
    private HeadLabCoordinatorSingleton() {
        this.coordinatorID = "C001";
        this.name = "Coordinator Carol";
        this.email = "coord@yorku.ca";
        this.department = "Administration";
    }

    // Only way to get the coordinator instance
    public static HeadLabCoordinatorSingleton getInstance() {
        if (instance == null) {
            instance = new HeadLabCoordinatorSingleton();
        }
        return instance;
    }

    /**
     * Req2 - Auto-generate a lab manager account.
     * Only the Head Lab Coordinator can do this.
     */
    public LabManager generateManagerAccount(String managerID, String name,
                                              String email, String tempPassword,
                                              String department) {
        System.out.println("[COORDINATOR] Generating manager account for: " + name);
        return new LabManager(managerID, name, email, tempPassword, managerID, department);
    }

    // Getters
    public String getCoordinatorID() { return coordinatorID; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getDepartment() { return department; }

    @Override
    public String toString() {
        return "HeadLabCoordinator [" + coordinatorID + "] " + name;
    }
}
