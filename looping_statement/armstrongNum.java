import java.util.Scanner;

class armstrongNum
{
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        int c=n;
        int arm=0;
        int r=0;
        while(n>0)
        {
            r=n%10;//3
            arm=(r*r*r)+arm;//9
            n=n/10;
        }
        if (c==arm)
        {
            System.out.println("it is armstrong number");
        }
        else{
            System.out.println("it is not armstong number");
        }
    }
}