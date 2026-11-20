public class Finally {
    public void run() {
        try {
            int number = 20 / 0;
            System.out.println("Result: " + number);
        }
        catch (ArithmeticException e) {
            System.out.println("Caught: Division is not possible.");
        } finally {
            System.out.println("Finally: Program execution completed.");
        }
    }
}
