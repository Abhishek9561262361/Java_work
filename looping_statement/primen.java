class primen
{
 public static void main(String[] args)
 {
  boolean check=false;
  int n=24;
  if(n==0||n==1)
  {
   System.out.println("invalid number");
  }
  else 
  {
    for(int i=2; i<n-1;i++)
    {
      if (n%i==0)
      {
       check=true;
      }
    }
    if(check)
    {
      System.out.println("not a prime number");
    }
   else 
    {
     System.out.println("prime number");
    }
    System.out.println(check);
  }
 }
}
