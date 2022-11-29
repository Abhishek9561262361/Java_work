import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("enter any number");
    int x=sc.nextInt();
    int count=0;
    for(int j=1;j<=x;j++)
    {
      for(int i=2;i<j;i++)
    {
      if(j%i==0)
      {
        count=count+1;
        System.out.println(count);
        System.out.println("================");
      
      }
      System.out.println(count);
    }
    if(count==0)
     {
        System.out.println(j);
     }

    }
  }
}