public class TypesVariables {
    public static void main(String[] args) {
        final double PI = 3.14159;
        double minimumWage = 2500.80;

        String myName = "Alexandre Fernandes";

        short shortNumber = 10;
        int normalNumber = shortNumber + 1;
        short shortNumber2 = (short) normalNumber;

        System.out.println("My name is: " + myName);
        System.out.println("The value of PI is: " + PI);
        System.out.println("The minimum wage is: " + minimumWage);
        System.out.println("The short number is: " + shortNumber);
        System.out.println("The normal number is: " + normalNumber);
        System.out.println("The short number 2 is: " + shortNumber2);
    }
}