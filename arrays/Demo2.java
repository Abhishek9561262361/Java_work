import java.util.ArrayList;
class Demo2
{
     public static void main(String[] args)
    {
        ArrayList<Integer> b=new ArrayList<Integer>();
        b.add(10);
        b.add(20);
        b.add(30);
        b.add(40);
        b.add(35);
        b.add(48);
        b.add(70);
        b.add(50);
        b.add(80);
        b.add(90);
        System.out.println(b);
        System.out.println("now lets remove that elements");
        b.remove(30);
        b.remove(40);
        b.remove(10);
        b.remove(90);
        System.out.println(b);
        System.out.println("now lets sort the given arraylist");
        b.sort(null);
        System.out.println(b);
        
    }
}