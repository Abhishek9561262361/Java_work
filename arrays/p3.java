class p3
{
 public static void m4()
 {
   int c[]={10,20,24,33};
   int large=c[0];
   for(int i=0;i<c.length;i++)
   {
     if(large<c[i])
     {
      large=c[i];
     }
   }
   System.out.println("the maximum value is: "+large);
 }
}
