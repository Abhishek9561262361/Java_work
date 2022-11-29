public class a14 {
    int a=30;
    int b;
    public void add(int a,int b)
    {
        System.out.println(a);
        int c=a*b;
        System.out.println(c);
        System.out.println(this.a);
        this.sub(23,12);
    }
    public void sub(int a,int b)
    {
        int c=a-b;
        System.out.println(c);
        System.out.println(this.a);
        System.out.println(this.b);
    }
    public static void main(String[] args) {
        System.out.println("main starts");
        a14 c=new a14();
        c.add(10,20);
        System.out.println("main ends");
    }
}
