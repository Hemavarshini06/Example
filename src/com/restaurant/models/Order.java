package src.com.restaurant.models;

public class Order {

    private int id;
    private int tableId;
    private double totalAmount;
    private String status;

    public Order(int id, int tableId) {
        this.id = id;
        this.tableId = tableId;
        this.totalAmount = 0;
        this.status = "PLACED";
    }

    public int getId() {
        return id;
    }

    public int getTableId() {
        return tableId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

