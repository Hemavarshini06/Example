package src.com.restaurant.repository;

import java.util.ArrayList;
import java.util.List;
import src.com.restaurant.models.OrderItem;

public class OrderItemRepository {
    private final List<OrderItem> items = new ArrayList<>();

    public List<OrderItem> show() {
        return items;
    }

    public void add(OrderItem item) {
        items.add(item);
    }

    public OrderItem findById(int id) {
        for (OrderItem item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }

    public void remove(int id) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.remove(i);
                break;
            }
        }
    }

    public int count() {
        return items.size();
    }
}