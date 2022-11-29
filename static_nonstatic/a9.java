public class a9 {
    int a;
    {
        a=20;
        System.out.println("ns block");
        System.out.println(a);
    }
    {
        System.out.println("ns block 2");
    }
    public static void main(String[] args) {
        System.out.println("main method");
        a9 obj=new a9();
        System.out.println(obj);
        System.out.println(obj.a);
        System.out.println("main ends");
    }
}
