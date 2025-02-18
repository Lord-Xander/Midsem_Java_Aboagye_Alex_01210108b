import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter voltage value");
        double voltage = input.nextDouble();
        System.out.println("Enter EMF value");
        double back_EMF = input.nextDouble();
        System.out.println("Enter MOTOR constant");
        double motor_constant = input.nextDouble();

        //Calculating the Speed

        if ((voltage <= 0 || back_EMF <= 0 || motor_constant <= 0)) {
            System.out.println("Invalid input");

        }
        else { double speed = (voltage - back_EMF) / motor_constant;
            System.out.printf("Speed is %.1f RPM%n" , speed);
        }

        }


}
