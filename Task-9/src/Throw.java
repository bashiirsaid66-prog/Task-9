public class Throw {
    public void run() {
        try {
            checkMarks(120);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}