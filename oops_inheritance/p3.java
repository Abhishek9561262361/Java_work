public class p3 extends p2 {
    int b=30;
    public void play(){
        System.out.println("playing method");
    }
    {
        System.out.println("static block p3");
    }
    public static void main(String[] args) {
        p3 obj=new p3();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.sing();
        obj.dance();
        obj.play();
    }
}
