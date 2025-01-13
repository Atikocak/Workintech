package employeeApp;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, int developerCount) {
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = new String[developerCount];
    }

    @Override
    public String toString() {
        StringBuilder developers = new StringBuilder("[");
        for (int i = 0; i < developerNames.length; i++) {
            developers.append(developerNames[i]);
            if (i < developerNames.length - 1) {
                developers.append(", ");
            }
        }
        developers.append("]");
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + ", developers=" + developers + "}";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            System.out.println("Giro 0'dan küçük olamaz.");
        } else {
            this.giro = giro;
        }
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Hatalı index: " + index);
        } else if (developerNames[index] == null) {
            developerNames[index] = name;
        } else {
            System.out.println("Index " + index + " zaten dolu.");
        }
    }
}
