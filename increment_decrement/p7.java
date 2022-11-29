class p7
{
  public static void main(String[] args)
  {
    int i=10;
    int b=i--;
    int c=--b + --b;
    int d=b-- + --i + b--;
   System.out.println(b);
   System.out.println(c);
   System.out.println(d);  
  } 
}