package b04.s42;

public class MyClass {

    static String h() {
        return "Hi";
    }

    int f(int a, int b) {
        return a * b;
    }

    void g(boolean flag) {
        if (flag) {
            System.out.println("Hello");
            return;
        }

        System.out.println("Goodbye");
    }
}