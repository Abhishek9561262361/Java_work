class add
{
 public static void main(String[] args)
 {
  int n=0;
  int sum=0;
  while (n<=100)
  {
    if (n%4==0 && n%9==0)
    {
     sum=sum+n;
    }
    n++;
  }
  System.out.println(sum);
 }
}
