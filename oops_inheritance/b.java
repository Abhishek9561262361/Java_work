public class b  extends a{
    int c;
    public void display() {
        System.out.println("this is the display method of class b");
    }
    public void sing() {
        System.out.println("this is the sing method of class b");
    }
    public static void main(String[] args) {
        b obj=new b();
        obj.display();
        obj.sing();
        obj.draw();
        a obj2=new a();
        obj2.display();
    }
}
