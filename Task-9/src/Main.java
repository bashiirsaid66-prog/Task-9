public class Main {
    public static void main(String[] args) {

        System.out.println("1. Try-Catch");
        TryCatch tryCatch = new TryCatch();
        tryCatch.run();

        System.out.println("\n2. Finally");
        Finally finallyDemo = new Finally();
        finallyDemo.run();

        System.out.println("\n3. Throw");
        Throw throwDemo = new Throw();
        throwDemo.run();

        System.out.println("\n4. Throws");
        Throws throwsDemo = new Throws();
        throwsDemo.run();
    }
}
