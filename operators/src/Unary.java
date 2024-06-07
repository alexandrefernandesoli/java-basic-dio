public class Unary {
    public static void main(String[] args) {
        int number = 5;
        boolean variable = true;

        number = -number;

        System.out.println(number);

        number = number * -1;

        System.out.println(number);

        number++;
        System.out.println(number);

        System.out.println(number++);

        System.out.println(++number);

        System.out.println(!variable);

        System.out.println(variable);

        variable = !variable;

        System.out.println(variable);
    }
}
