import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter final number");
        int n=sc.nextInt();
        System.out.println("the table of given number is");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=10;j++)
            {
                System.out.println(i*j/n);
            }
        }
    }
}
