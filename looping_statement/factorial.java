import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        double sum=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any value");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum*i;
        }  
        System.out.println(sum);
    }
}
