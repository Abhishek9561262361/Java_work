class static1
{
  static int b=20;
  public static void main(String[] args)
  {
   System.out.println("access directly"+b);
   System.out.println("accessing from class name"+static1.b);
  }
}