public class a5 extends a4
{
    public void app() {
        System.out.println("this is the app method of class a4");
    }
    public void love() {
        System.out.println("this is the love method of class a4");
    }
     public static void main(String[] args)
    {
        a5 obj=new a5();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        obj.app();
        obj.love();
        obj.display();
        obj.display2();
    }
}