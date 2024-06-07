public class Logical {
    public static void main(String[] args) {
        boolean firstCondition = true;
        boolean secondCondition = false;

        if (firstCondition && secondCondition) {
            System.out.println("Both conditions are true.");
        }

        if (firstCondition || secondCondition) {
            System.out.println("At least one condition is true.");
        }

        if (!firstCondition) {
            System.out.println("The first condition is false.");
        }

        if (!secondCondition) {
            System.out.println("The second condition is false.");
        }
    }
}
