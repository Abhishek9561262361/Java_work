import java.util.HashSet;
import java.util.TreeSet;

public class p4 {
    public static void main(String[] args) {
        HashSet obj=new HashSet<>();
        obj.add(1);
        obj.add(3);
        obj.add(4);
        obj.add(7);
        obj.add(8);
        System.out.println(obj);
        TreeSet obj1=new TreeSet<>();
        obj1.add(20);
        obj1.add(45);
        obj1.add(3);
        obj1.add(86);
        obj1.add(7);
        System.out.println(obj1);
        // obj.retainAll(obj1);
        obj.removeAll(obj1);
        System.out.println(obj);
        System.out.println(obj1);
    }
}
