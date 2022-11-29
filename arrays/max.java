class max
{
    public static void main(String[] args) {
        int a[] ={10,22,343,44,554,556,7,77,21};
        int large =a[0];
        for(int i=0;i<a.length;i++) 
        {
            if(large<a[i])
            {
                large=a[i];
            }
        }
        System.out.println(large);
    }
}