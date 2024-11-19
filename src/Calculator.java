public class Calculator {

    public static <T extends Number> T sum(T a, T b) {
        if (a instanceof Integer) {
            return (T) (Number) ((Integer) a + (Integer) b);
        } else if (a instanceof Double) {
            return (T) (Number) ((Double) a + (Double) b);
        } else {
            return null;
        }
    }

    public static <T extends Number> T multiply(T a, T b) {
        if (a instanceof Integer) {
            return (T) (Number) ((Integer) a * (Integer) b);
        } else if (a instanceof Double) {
            return (T) (Number) ((Double) a * (Double) b);
        } else {
            return null;
        }
    }

    public static <T extends Number> T divide(T a, T b) {
        if (a instanceof Integer) {
            return (T) (Number) ((Integer) a / (Integer) b);
        } else if (a instanceof Double) {
            return (T) (Number) ((Double) a / (Double) b);
        } else {
            return null;
        }
    }

    public static <T extends Number> T subtract(T a, T b) {
        if (a instanceof Integer) {
            return (T) (Number) ((Integer) a - (Integer) b);
        } else if (a instanceof Double) {
            return (T) (Number) ((Double) a - (Double) b);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println("Sum of integers: " + sum(10, 20));
        System.out.println("Product of doubles: " + multiply(2.5, 3.0));
        System.out.println("Division of integers: " + divide(15, 3));
        System.out.println("Subtraction of doubles: " + subtract(7.0, 3.5));
    }
    }