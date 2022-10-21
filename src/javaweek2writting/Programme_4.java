package javaweek2writting;

public class Programme_4 {
    String Name = "Prime";
    String Surname = "Testing";
      static boolean a = true;
    static boolean b = false;
    public void instanceMethod() {
        System.out.println(Name);
        System.out.println(Surname);
        System.out.println(Programme_4.a);
        System.out.println(Programme_4.b);
    }
    public static void staticMethod() {
        Programme_4 programme_4 = new Programme_4();
        System.out.println(programme_4.Name);
        System.out.println(programme_4.Surname);
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        Programme_4 programme_4 = new Programme_4();
        programme_4.instanceMethod();
        staticMethod();
    }
}
