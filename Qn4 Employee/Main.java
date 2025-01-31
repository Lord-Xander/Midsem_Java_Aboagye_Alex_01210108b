
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter Consumer Number" );
        int consumerNumber = sc.nextInt();
        System.out.println( "Enter Consumer Name" );
        String consumerName = sc.next();
        System.out.println( "Connection Type" );
        String connectionType = sc.next();
        System.out.println( "Previous Month Reading" );
        double previousMonthReading = sc.nextDouble();
        System.out.println( "Current Month Reading" );
        double currentMonthReading = sc.nextDouble();

        BillGenerate bill = new BillGenerate( consumerNumber, consumerName, currentMonthReading, previousMonthReading,  connectionType);
            bill.calculateBill();
            bill.display();


    }
    
}