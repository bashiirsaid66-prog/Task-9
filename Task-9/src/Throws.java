public class Throws {
    public void run() {
        try {
            connectDatabase();
        } catch (Exception e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
    private void connectDatabase() throws Exception {
        throw new Exception("Database connection failed.");
    }
}
