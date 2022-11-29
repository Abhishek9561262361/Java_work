public class c2 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=200;
        if(a>b)
        {
            if (a>c)
            {
            System.out.println(a+": is maximum");
            }
            else 
            {
                System.out.println(c+ " :is max");
            }
        }
        else if(b>c) 
        {
            System.out.println(b+ " : is maximum");
        }
        else 
        {
            System.out.println(c+ " : is maximum");
        }
    }
}
