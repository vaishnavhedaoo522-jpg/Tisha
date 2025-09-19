package automationtest;


	
	//Example: Storing Data in a Class

// Define a class
class Person {
    String name;
    int age;

    // Constructor to initialize values
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display data
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class to use the Person class
public class Classdatatype {
    public static void main(String[] args) {
        // Creating objects of the class
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);

        // Calling method to display data
        p1.display();
        p2.display();
    }
}









//Syntax for Class

//class ClassName {
    // Attributes (instance variables)
//    dataType variableName;

    // Constructor
//    ClassName(dataType parameter) {
//        this.variableName = parameter;
//    }