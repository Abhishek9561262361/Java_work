import java.util.Scanner;

class primeNumber
{
  public static void prm(int x)
  {
    int count=0;
    for(int j=2;j<=x;j++)
    {
      for(int i=2;i<j;i++)
    {
      if(x%i==0)
      {
        count++;
      }
      if (count==0){
        System.out.println(j);
      }
    }
    }
  }
   public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter any number");
    int n=sc.nextInt();
    // primeNumber obj=new primeNumber();
    primeNumber.prm(n);
  }
}