
package src.com.restaurant.models;

public class MenuItem {

    public enum Availability {
        AVAILABLE, UNAVAILABLE
    }

    private int id;
    private String name;
    private double price;
    private String category;
    private Availability available;

    public MenuItem(int id, String name, double price,
                    String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.available = Availability.UNAVAILABLE;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public Availability isAvailable() {
        return available;
    }

    public void setAvailable(Availability available) {
        this.available = available;
    }
}
