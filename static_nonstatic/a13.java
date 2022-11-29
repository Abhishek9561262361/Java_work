public class a13 {
    int a=10;
    int b;
    int c=2;
    {
        System.out.println(a);
        int a=30;
        System.out.println(a);
        System.out.println(this.a);
    }
    {
        System.out.println(a);
        int c=20;
        System.out.println(c);
        System.out.println(this.b);
        System.out.println(this.c);
    }
    public static void main(String[] args) {
        System.out.println("main starts");
        a13 a = new a13();
        System.out.println("main ends");
    }
}
