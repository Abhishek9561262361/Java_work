class p1
{
 public static void m2()
 {
   int a[]={10,20};
   int large=a[0];
   for(int i=0;i<a.length;i++)
   {
     if(large<a[i])
     {
      large=a[i];
     }
   }
   System.out.println("the maximum value is: "+large);
 }
}