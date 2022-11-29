import java.util.Scanner;

public class prg {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter any number");
       int n=sc.nextInt();
       int rev=0;
       int c;
       //System.out.println("fatorial is:");
       while(n>0){
           c=n%10;
           rev=rev*10+c;
           n=n/10;
       }
       System.out.println(rev);
   } 
}
