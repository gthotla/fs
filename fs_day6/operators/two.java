public class two {
    public static void main(String[] args) {
        int a = 3;
        int b = ++a * 5 / a-- + --a;
        System.out.println("a is " + a);
        System.out.println("b is " + b);

        String str = "Genesis";
        System.out.println(str instanceof String);
        System.out.println(str instanceof Object);
       // System.out.println(a instanceof Number);
    }
}
