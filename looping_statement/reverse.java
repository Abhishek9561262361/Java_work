import java.util.Scanner;

public class reverse {
   public static void main(String[] args) {
    //    Scanner sc=new Scanner(System.in);
    //    System.out.println("enter three digit value");
    //    int n=sc.nextInt();
    //    int a,b,c,d,e;
    //    a=n%10;//3
    //    b=n/10;//12
    //    c=b%10;//2
    //    d=b/10;//1
    //    e=a*100+c*10+d;
    //    System.out.println(e);
    // for any value we get.
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any value");
    int n=sc.nextInt();
    int value=0;
    int rev=0;

    while(n>0)
    {
       value=n%10;
       rev=rev*10+value;
       n=n/10;
    }
    System.out.println(rev);
   }
}
