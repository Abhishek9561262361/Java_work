public class a10 {
    //lets make our constructor which is more helpful and lets check it as a long input.
    int a;
    a10(int n)
    {
        System.out.println(n*n);
    }
    {
        a=10;
        System.out.println(a);
    }
    public static void main(String[] args) {
        System.out.println("main ends");
        a10 obj=new a10(20);
        System.out.println(obj.a);
        // can we use the constructor value for addition with main int and gives output in main method
    }
}
