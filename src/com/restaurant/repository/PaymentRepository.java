package src.com.restaurant.repository;

import src.com.restaurant.models.payment;
import java.util.ArrayList;
import java.util.List;

public class PaymentRepository {

    private final List<payment> payments = new ArrayList<>();

    public void save(payment payment) {
        payments.add(payment);
    }

    public List<payment> findAll() {
        return new ArrayList<>(payments);
    }

    public payment findById(int id) {
        for (payment payment : payments) {
            if (payment.getId() == id) {
                return payment;
            }
        }
        return null;
    }
}