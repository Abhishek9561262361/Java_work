import java.util.Scanner;

public class a17 {
    int a=10;
    int b;
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.println(n);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("main starts");
        a17 b=new a17();
        System.out.println("main ends");
    }
}
