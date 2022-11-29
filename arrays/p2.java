class p2
{
 public static void m3()
 {
   int b[]={10,20,23};
   int large=b[0];
   for(int i=0;i<b.length;i++)
   {
     if(large<b[i])
     {
      large=b[i];
     }
   }
   System.out.println("the maximum value is: "+large);
 }
}