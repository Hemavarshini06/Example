package src.com.restaurant.cli;

import java.util.Scanner;
import src.com.restaurant.models.OrderItem;
import src.com.restaurant.services.OrderItemServices;

public class OrderItemCli {
    private final Scanner sc = new Scanner(System.in);
    private final OrderItemServices service = new OrderItemServices();

    public void showMenu() {
        int choice;

        do {
            System.out.println("\n1. Add Order Item");
            System.out.println("2. Show Order Items");
            System.out.println("3. Find Order Item");
            System.out.println("4. Remove Order Item");
            System.out.println("5. Count Order Items");
            System.out.println("0. Back");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Order ID: ");
                    int orderId = sc.nextInt();
                    System.out.print("Enter Menu Item ID: ");
                    int menuItemId = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    OrderItem item = new OrderItem(
                            id, orderId, menuItemId, quantity, price);

                    if (service.addItem(item)) {
                        System.out.println("Order item added");
                    } else {
                        System.out.println("Invalid order item");
                    }
                    break;

                case 2:
                    for (OrderItem item1 : service.getAll()) {
                        System.out.println(item1.getId() + " "
                                + item1.getOrderId() + " "
                                + item1.getMenuItemId() + " "
                                + item1.getQuantity() + " "
                                + item1.getPrice() + " "
                                + item1.getSubtotal());
                    }
                    break;

                case 3:
                    System.out.print("Enter Item ID: ");
                    OrderItem found = service.getById(sc.nextInt());

                    if (found != null) {
                        System.out.println(found.getId() + " "
                                + found.getOrderId() + " "
                                + found.getMenuItemId() + " "
                                + found.getQuantity() + " "
                                + found.getSubtotal());
                    } else {
                        System.out.println("Item not found");
                    }
                    break;

                case 4:
                    System.out.print("Enter Item ID: ");
                    service.removeItem(sc.nextInt());
                    System.out.println("Remove operation completed");
                    break;

                case 5:
                    System.out.println("Total Order Items: "
                            + service.countItems());
                    break;
            }
        } while (choice != 0);
    }
}

