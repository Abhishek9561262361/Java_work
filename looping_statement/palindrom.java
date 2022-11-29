import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int r,temp;
        int sum=0;
        temp=n;
        while(n>0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if (temp==sum)
        {
            System.out.println("it is palindrom number");
        }
        else{
            System.out.println("it is not palindrom number");
        }
    }
}
