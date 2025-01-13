package employeeApp;

public class Employee {
    private long id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(long id, String fullName, String email, String password, int healthplanCapacity) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = new String[healthplanCapacity];
    }

    @Override
    public String toString() {
        StringBuilder plans = new StringBuilder("[");
        for (int i = 0; i < healthplans.length; i++) {
            plans.append(healthplans[i]);
            if (i < healthplans.length - 1) {
                plans.append(", ");
            }
        }
        plans.append("]");
        return "Employee{id=" + id + ", fullName='" + fullName + "', email='" + email + "', healthplans=" + plans + "}";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public void addHealthplan(int index, String name) {
        if (index < 0 || index >= healthplans.length) {
            System.out.println("Hatalı index: " + index);
        } else if (healthplans[index] == null) {
            healthplans[index] = name;
        } else {
            System.out.println("Index " + index + " zaten dolu.");
        }
    }
}
