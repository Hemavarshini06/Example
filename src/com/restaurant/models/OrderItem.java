package src.com.restaurant.models;

public class OrderItem {
    private int id;
    private int orderId;
    private int menuItemId;
    private int quantity;
    private double price;

    public OrderItem(int id, int orderId, int menuItemId,
                     int quantity, double price) {
        this.id = id;
        this.orderId = orderId;
        this.menuItemId = menuItemId;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getMenuItemId() {
        return menuItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getSubtotal() {
        return quantity * price;
    }
}