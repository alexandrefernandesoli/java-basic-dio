public class Concatenation {
    public static void main(String[] args) {
        String concat = "?";

        concat = 1 + 1 + 1 + "1";

        System.out.println(concat);

        concat = 1 + "1" + 1 + 1;

        System.out.println(concat);

        concat = 1 + "1" + 1 + "1";

        System.out.println(concat);

        concat = "1" + 1 + 1 + 1;

        System.out.println(concat);

        concat = "1" + (1 + 1 + 1);

        System.out.println(concat);
    }
}