public class throwsandthrows
{
    public static double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("10 / 2 = " + divide(10, 2));
            

            System.out.println("10 / 0 = " + divide(10, 0));
        } catch (ArithmeticException e) {
            System.out.println("Error occurred: " + e.getMessage());
        } finally {
            System.out.println("Calculations completed.");
        }
    }
}
