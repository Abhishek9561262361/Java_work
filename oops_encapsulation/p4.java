import java.util.Scanner;

class p4{
     public static void main(String[] args)
    {
        Scanner c=new Scanner(System.in);
        System.out.println("enter your name");
        String s=c.next();
        System.out.println("enter your village");
        String s2=c.next();
        System.out.println("enter your salary");
        int s3=c.nextInt();
        System.out.println("enter your company name");
        String s4=c.next();
        System.out.println("enter your year of joining");
        int se=c.nextInt();
        System.out.println("so your employement details is as follows: ");
        p3 obj=new p3(s,s2,s3,s4,se);
        obj.details();
    }
}