import java.util.Scanner;

class p2
{
   public void reverse(int a)
   {
       int rev=0;
      //  int c;
       int value=0;
       while(a>0)
       {
          value=a%10;
          rev=(rev*10)+value;
          a=a/10;
       }
       System.out.println(rev);
   }   
   public static void main(String[] args)
   {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter any number");
      int n=sc.nextInt();
      p2 obj=new p2();
      obj.reverse(n);
      //  System.out.println(d);
   }
}