package src.com.restaurant.cli;

import java.util.Scanner;
import src.com.restaurant.models.Order;
import src.com.restaurant.services.OrderServices;

public class OrderCli {
    private final Scanner sc = new Scanner(System.in);
    private final OrderServices service = new OrderServices();

    public void showMenu() {
        int choice;

        do {
            System.out.println("\n1. Add Order");
            System.out.println("2. Show Orders");
            System.out.println("3. Find Order");
            System.out.println("4. Remove Order");
            System.out.println("5. Count Orders");
            System.out.println("0. Back");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Order ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Table ID: ");
                    int tableId = sc.nextInt();

                    if (service.addOrder(new Order(id, tableId))) {
                        System.out.println("Order added");
                    } else {
                        System.out.println("Invalid order");
                    }
                    break;

                case 2:
                    for (Order order : service.getAll()) {
                        System.out.println(order.getId() + " "
                                + order.getTableId() + " "
                                + order.getTotalAmount() + " "
                                + order.getStatus());
                    }
                    break;

                case 3:
                    System.out.print("Enter Order ID: ");
                    Order order = service.getById(sc.nextInt());

                    if (order != null) {
                        System.out.println(order.getId() + " "
                                + order.getTableId() + " "
                                + order.getTotalAmount() + " "
                                + order.getStatus());
                    } else {
                        System.out.println("Order not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Order ID: ");
                    service.removeOrder(sc.nextInt());
                    System.out.println("Remove operation completed");
                    break;

                case 5:
                    System.out.println("Total Orders: "
                            + service.countOrders());
                    break;
            }
        } while (choice != 0);
    }
}
    

