import java.util.Scanner;

public class cal {
    public void add(int a,int b)
    {
        System.out.println(a+b);
        System.out.println("can you want to do furthur operation for this values enter true or false");
        Scanner sc=new Scanner(System.in);
        boolean z=sc.nextBoolean();
        if(z==true){
            this.sub(a,b);
            this.mul(a,b);
            this.div(a,b);
        }
    }
    public void sub(int x,int y)
    {
        if(x>y)
        {
            System.out.println(x-y);
        }
        else{
            System.out.println(y-x);
        }
    }
    public void mul(int p,int q)
    {
        System.out.println(p*q);
    }
    public void div(int a,int b)
    {
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        System.out.println("inside main");
        cal obj=new cal();
        obj.add(10,20);
        System.out.println("main ends");
    }
}
