import java.util.ArrayList;

public class p {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList<>();
        obj.add(10);
        obj.add(98);
        obj.add(true);
        obj.add('a');
        obj.add("ROOMMATES");
        System.out.println(obj);
        System.out.println(obj.isEmpty());
        System.out.println(obj.get(1));
        System.out.println(obj.remove(2));
        System.out.println(obj.size());
        ArrayList obj1=new ArrayList<>();
        obj1.add(20);
        obj1.add(false);
        obj1.add('b');
        obj1.add(93);
        obj1.add("Qsp");
        System.out.println(obj1);
        obj.remove(2);
        System.out.println(obj1);
        obj.removeAll(obj1);
        System.out.println(obj);
        System.out.println(obj1);
    }
}
