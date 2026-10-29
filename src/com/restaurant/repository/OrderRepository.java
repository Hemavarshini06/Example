
package src.com.restaurant.repository;

import java.util.ArrayList;
import java.util.List;
import src.com.restaurant.models.Order;

public class OrderRepository {
    private final List<Order> orders = new ArrayList<>();

    public List<Order> show() {
        return orders;
    }

    public void add(Order order) {
        orders.add(order);
    }

    public Order findById(int id) {
        for (Order order : orders) {
            if (order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    public void remove(int id) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getId() == id) {
                orders.remove(i);
                break;
            }
        }
    }

    public int count() {
        return orders.size();
    }
}

