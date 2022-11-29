public class a16 {
    a16(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }
    public static void main(String[] args) {
        System.out.println("to print the table of n");
        a16 obj=new a16(12);
        System.out.println("main ends");
    }
}
