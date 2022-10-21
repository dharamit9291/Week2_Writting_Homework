package javaweek2writting;

public class Programme_1 {
    int a = 10;
    int b = 20;
        public void instanceMethod() {
        System.out.println(a);
        System.out.println(b);
    }
        public static void main(String[] args) {
        Programme_1 programme_1 = new Programme_1();
        programme_1.instanceMethod();
    }
}
