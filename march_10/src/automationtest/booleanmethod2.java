package automationtest;

public class booleanmethod2 {
//Example: Boolean with Methods
	public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int num = 8;
        if (isEven(num)) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }

}
}