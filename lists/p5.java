import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class p5 {
    public static void main(String[] args) {
        ArrayList obj=new ArrayList<>();
        obj.add(10);
        obj.add(23);
        obj.add(86);
        obj.add(54);
        obj.add(12);
        System.out.println(obj);
        HashSet obj1=new HashSet<>();
        obj1.add(32);
        obj1.add(23);
        obj1.add(76);
        obj1.add(65);
        obj1.add(12);
        System.out.println(obj1);
        // obj.removeAll(obj1);
        Iterator it=obj.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        } 
        System.out.println(obj.get(1));
        System.out.println(obj);
        System.out.println(obj1);
    }
}
