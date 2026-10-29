package src.com.restaurant.services;

import java.util.List;
import src.com.restaurant.models.Order;
import src.com.restaurant.repository.OrderRepository;

public class OrderServices {
    private final OrderRepository repository;

    public OrderServices() {
        repository = new OrderRepository();
    }

    public List<Order> getAll() {
        return repository.show();
    }

    public Order getById(int id) {
        return repository.findById(id);
    }

    public boolean addOrder(Order order) {
        if (order == null || order.getId() <= 0
                || order.getTableId() <= 0) {
            return false;
        }

        repository.add(order);
        return true;
    }

    public void removeOrder(int id) {
        repository.remove(id);
    }

    public int countOrders() {
        return repository.count();
    }

    public boolean updateStatus(int id, String status) {
        Order order = repository.findById(id);

        if (order == null || status == null) {
            return false;
        }

        order.setStatus(status);
        return true;
    }
}
