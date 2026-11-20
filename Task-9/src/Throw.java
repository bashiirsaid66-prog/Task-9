public class Throw {
    public void run() {
        try {
            checkMarks(120);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
    private void checkMarks(int marks) {
        if (marks > 100 || marks < 0) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }

        System.out.println("Valid marks.");
    }
}