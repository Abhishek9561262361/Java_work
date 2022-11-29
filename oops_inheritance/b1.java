class b1 extends a1
{
    int b=20;
    public void sing(){
        System.out.println("singing");
    }
    b1(int c){
        super(30);
        System.out.println(c);
    }
    b1(){
        System.out.println("constructor b1");
    }
    {
        System.out.println("non static block 2");
    }
     public static void main(String[] args)
    {
        b1 obj=new b1(20);
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.sing();
        obj.dance();
    }
}