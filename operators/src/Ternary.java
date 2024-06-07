public class Ternary {
    public static void main(String[] args) {
        int number = (int) Math.floor(Math.random() * 10);

        boolean variable = number > 5;

        number = (variable) ? 1 : 0;

        System.out.println(number);

        number = (variable) ? 1 : -1;

        System.out.println(number);

        number = (variable) ? 1 : 0;

        System.out.println(number);

        System.out.println((variable) ? 1 : 0);

        System.out.println((variable) ? 1 : -1);

        System.out.println(variable ? false : true);

        System.out.println(variable ? true : false);

        variable = variable ? false : true;

        System.out.println(variable);
    }
}
