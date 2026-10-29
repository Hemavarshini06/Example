package src.com.restaurant.cli;

//import src.com.restaurant.models.Table;
import src.com.restaurant.services.TableServices;
import java.util.Scanner;
public class TableCli {
    private final TableServices Service;
    Scanner z=new Scanner(System.in);

    public TableCli(TableServices Service) {
        this.Service = Service;
    }

    public void start() {
        int choice;
        do {
            System.out.println("Table Management");

            System.out.println("1. All Tables");
            choice = z.nextInt();
            switch (choice) {
                case 1:
                    Service.getAll();
                    break;

                default:
                    System.out.println("Balance Ur Wish");
                    break;
            }
        } while (choice != 0);
    }
}