class p3
{
  public static void main(String[] args)
  {
    int i=10;
    int b=++i;
    int c=b++;
    int d=c++ + ++i + b++;
   System.out.println(d);
   System.out.println(b);
   System.out.println(c);  
  } 
}