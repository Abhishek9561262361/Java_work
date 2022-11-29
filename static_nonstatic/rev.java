class rev
{
   public void num(int a)
   {
       int rev=0;
      //  int c;
       int value=0;
       while(a>0)
       {
          value=a%10;
          rev=(rev*10)+value;
          a=a/10;
       }
       System.out.println(rev);
   }   
}