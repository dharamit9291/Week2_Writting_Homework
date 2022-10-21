package javaweek2writting;

public class Programme_3 {
    String name = "Prime";
    static String surname = "Testing";

    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Programme_3.surname);
    }
       public static void staticMethod() {
        Programme_3 programme_3 = new Programme_3();
        System.out.println(programme_3.name);
        System.out.println(surname);
    }
        public static void main(String[] args) {
        Programme_3 programme_3 = new Programme_3();
        programme_3.instanceMethod();
        staticMethod();
    }
}
