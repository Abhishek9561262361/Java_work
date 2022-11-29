public class a18 {
    //now lets try to call static and non static method inside the class area.
    static int  a=10;
    int b=20;
    static{
        System.out.println("inside static block");
        int a=20;
        System.out.println(a);
        System.out.println(a18.a);
    }
    {
        System.out.println("inside ns block");
        int b=20;
        System.out.println(b);
        System.out.println(this.b);
    }
    public static void main(String[] args) {
        System.out.println("inside main method");
        a18 obj=new a18();
        System.out.println("main ends");
    }
    
}
//as we seen from output static block will execute first and then ns block will execute and gives output.
//this is the method of loading of s and ns block inside the class block.