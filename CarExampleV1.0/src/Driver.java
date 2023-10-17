import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        System.out.println("Car Project V1.0!");

        Scanner input = new Scanner(System.in);
        Car car1 = new Car();

        System.out.println("Enter a Car Make : ");
        String make = input.nextLine();

        System.out.println("Enter a Car Price (rmb) : ");
        float price = input.nextFloat();

        car1.setMake(make);
        car1.setPrice(price);

        car1.display();
    }
}