package src.com.restaurant.services;

import src.com.restaurant.models.payment;
import src.com.restaurant.payment.PaymentMethod;
import src.com.restaurant.repository.PaymentRepository;
import java.util.List;

public class PaymentService {

    private final PaymentRepository repository;
    private int nextPaymentId = 1;

    public PaymentService() {
        repository = new PaymentRepository();
    }

    public payment processPayment(
            PaymentMethod method, double amount) {

        // Runtime polymorphism
        method.pay(amount);

        payment payment = new payment(
                nextPaymentId++,
                amount,
                method.getMethodName(),
                "SUCCESS");

        repository.save(payment);

        return payment;
    }

    public List<payment> getAllPayments() {
        return repository.findAll();
    }

    public payment getPaymentById(int id) {
        payment payment = repository.findById(id);

        return payment;
    }
}