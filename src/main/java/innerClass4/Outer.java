package innerClass4;

public class Outer {
    private static void outerMethod() {
        System.out.println("inside outerMethod");
    }
    // A static inner class
    static class Inner {
        public static void main(String[] args) {
            outerMethod();
            System.out.println("inside inner class Method");

        }
    }
}
