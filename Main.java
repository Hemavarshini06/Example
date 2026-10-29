import src.com.restaurant.cli.PaymentCli;
import src.com.restaurant.cli.TableCli;
import src.com.restaurant.services.TableServices;

public class Main{
    public static void main(String[] args) {
        PaymentCli cli = new PaymentCli();
        cli.start();
    }

}