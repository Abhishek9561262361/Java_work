import java.util.Scanner;

public class fibonesis {
    public void num(int n){
        int a=10;
        int b=1;
        int value;
        for(int i=0;i<=n;i++){
            System.out.println(a);
            value=a*b;
            a=b;
            b=value;
        }
        System.out.println(b);
    }
    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     fibonesis obj=new fibonesis();
    //     obj.num(n);
    // }
}