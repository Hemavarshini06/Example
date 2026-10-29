package src.com.restaurant.services;

import java.util.List;
import src.com.restaurant.models.OrderItem;
import src.com.restaurant.repository.OrderItemRepository;

public class OrderItemServices {
    private final OrderItemRepository repository;

    public OrderItemServices() {
        repository = new OrderItemRepository();
    }

    public List<OrderItem> getAll() {
        return repository.show();
    }

    public OrderItem getById(int id) {
        return repository.findById(id);
    }

    public boolean addItem(OrderItem item) {
        if (item == null || item.getId() <= 0
                || item.getOrderId() <= 0
                || item.getMenuItemId() <= 0
                || item.getQuantity() <= 0
                || item.getPrice() <= 0) {
            return false;
        }

        repository.add(item);
        return true;
    }

    public void removeItem(int id) {
        repository.remove(id);
    }

    public int countItems() {
        return repository.count();
    }
}