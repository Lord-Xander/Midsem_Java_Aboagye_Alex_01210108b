import java.util.Scanner;
//Using Ohms Law to calculate
//Voltage
//Current
//Resistance

public class ohmsLaw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Calculate voltage");
            System.out.println("2. Calculate current ");
            System.out.println("3. Calculate resistance");
            System.out.println("Enter your choice : ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter current value: ");
                    Scanner current_value = new Scanner(System.in);
                    double current = current_value.nextDouble();

                    System.out.println("Enter resistance value: ");
                    Scanner resistance_value = new Scanner(System.in);
                    double resistance = resistance_value.nextDouble();
                    double voltage = current * resistance;
                    System.out.println("Voltage value is: " + voltage+"V");
                    break;

                case 2:
                    System.out.println("Enter voltage value: ");
                    Scanner voltage_value = new Scanner(System.in);
                    double voltage1 = voltage_value.nextDouble();

                    System.out.println("Enter resistance value: ");
                    Scanner resistance_value1 = new Scanner(System.in);
                    double resistance1 = resistance_value1.nextDouble();
                    double current_result = voltage1 / resistance1;
                    System.out.println("Current value is: " + current_result+"A");
                    break;

                case 3:
                    System.out.println("Enter current value: ");
                    Scanner current_value1 = new Scanner(System.in);
                    double current2 = current_value1.nextDouble();

                    System.out.println("Enter resistance value: ");
                    Scanner resistance_value2 = new Scanner(System.in);
                    double voltage2 = resistance_value2.nextDouble();
                    double resistance_result = voltage2 / current2;
                    System.out.println("Resistance value is: " + resistance_result + "ohms");
                    break;

            }

        }
    }
}

