public class TryCatch {
    public void run() {
        try {
            int number = Integer.parseInt("Hello");
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught: Invalid number format.");
        } catch (Exception e) {
            System.out.println("Caught: Unexpected error.");
        }
    }
}