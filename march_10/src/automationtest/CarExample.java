package automationtest;
//Example: Using a Class with Multiple Data Types
class Car {
    String brand;
    int year;
    double price;

    // Constructor
    Car(String brand, int year, double price) {
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    // Display method
    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 2022, 25000.50);
        myCar.showDetails();
    }
}
