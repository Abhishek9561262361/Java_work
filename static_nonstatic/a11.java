public class a11 {
    int a;
    int b;
    int c;
    public void add(int n,int b)
    {
        System.out.println(n*b);
    }
    public void sub(int c,int d)
    {
        System.out.println(c-d);
    }
}
//we can call the one ns method to another ns method by using the constructor.
class a12{
    public static void main(String[] args) {
        a11 obj=new a11();
        obj.add(10,20);
        obj.sub(30,20);
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
    }
}