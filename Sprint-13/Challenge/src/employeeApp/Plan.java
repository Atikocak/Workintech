package employeeApp;

public enum Plan {
    BASIC("Basic Plan", 100.0),
    PREMIUM("Premium Plan", 300.0);

    private final String name;
    private final double price;

    Plan(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
