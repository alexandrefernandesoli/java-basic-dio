public class Relational {
    public static void main(String[] args) {
        int number1 = (int) Math.floor(Math.random() * 10);
        int number2 = (int) Math.floor(Math.random() * 10);

        String nameOne = "John";
        String nameTwo = new String("John");

        System.out.println(nameOne.equals(nameTwo));

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);

        boolean yesOrNo = number1 == number2;

        System.out.println("Number 1 is equal to Number 2? " + yesOrNo);

        yesOrNo = number1 != number2;

        System.out.println("Number 1 is not equal to Number 2? " + yesOrNo);

        yesOrNo = number1 > number2;

        System.out.println("Number 1 is greater than Number 2? " + yesOrNo);

        yesOrNo = number1 < number2;

        System.out.println("Number 1 is less than Number 2? " + yesOrNo);

        yesOrNo = number1 >= number2;

        System.out.println("Number 1 is greater than or equal to Number 2? " + yesOrNo);

        yesOrNo = number1 <= number2;

        System.out.println("Number 1 is less than or equal to Number 2? " + yesOrNo);
    }
}
