public class a15 {
    int a=20;
    int b;
    a15(int a)
    {
        System.out.println("constructor starts");
        int n=a*a*a;
        System.out.println("the square of the given constraints is"+n);
    }
    {
        System.out.println("the non static block");
        int c=this.a+this.b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        a15 obj=new a15(13);
        System.out.println("main ends");
    }
}
