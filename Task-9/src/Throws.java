public class Throws {
    public void run() {
        try {
            connectDatabase();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
