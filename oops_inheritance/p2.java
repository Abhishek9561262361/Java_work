class p2 extends p1 {
    int b=20;
    public void sing(){
        System.out.println("sing methods");
    }
    p2(){
        System.out.println("p2 constructor invoked");
    }
    {
        System.out.println("static block p2");
    }
    public static void main(String[] args) {
        p2 obj=new p2();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.sing();
        obj.dance();
        System.out.println("hence ended");
    }
}