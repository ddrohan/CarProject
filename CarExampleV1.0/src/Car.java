import java.util.Scanner;

public class Car {

    // this is 
    private String make;
    private float price;

    public Car() {}

    public String getMake() {
        return make;
    }

    public float getPrice() {
        return price;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDetails()
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Car Make : ");
        this.make = input.nextLine();

        System.out.println("Enter a Car Price (rmb) : ");
        this.price = input.nextFloat();
    }

    public void display() {
        System.out.println("The Car Make : " + this.make);
        System.out.println("The Car Price : " + this.price + "rmb");
    }
}
