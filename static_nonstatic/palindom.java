import java.util.Scanner;

public class palindom {
    public void num(int a){
        int r; 
        int sum=0;
        int temp;
        temp=a;
        while(a>0){
            r=a%10;
            sum=(sum*10)+r;
            a=a/10;
        }
        if(temp==sum){
            System.out.println("palindrom number");
        }
        else{
            System.out.println("not palindrom");
        }
    }
    // public static void main(String[] args) {
    //          Scanner sc=new Scanner(System.in);
    //          int n=sc.nextInt();
    //          palindom obj=new palindom();
    //          obj.num(n);
    //      }
}
