public class MyClass {
    public static void main(String[] args) {
        String name = args[0];
        String surname = args[1];
        int age = Integer.parseInt(args[2]);
        double height = Double.parseDouble(args[3]);

        System.out.printf("""
                Hello, my name is %s %s.
                I am %d years old and %.2fm tall.
                """, name, surname, age, height);
    }
}