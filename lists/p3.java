import java.util.TreeSet;

public class p3 {
    public static void main(String[] args) {
        TreeSet obj=new TreeSet<>();
         obj.add(39);
         obj.add(94);
         obj.add(45);
         obj.add(23);
         obj.add(32);
         TreeSet obj1=new TreeSet<>();
         obj1.add(93);
         obj1.add(23);
         obj1.add(71);
         obj1.add(80);
         obj1.add(45);
         System.out.println(obj1);
        //  obj.add(1,33);// this method is not applicable for the hashset value.
        // int c=obj.size();//this is used to print the size of the given hashlist
        // System.out.println(c);
        // obj.addAll(obj1);//we can add the values of the list1 to list2.
        // System.out.println(obj);
        // System.out.println(obj1);
        System.out.println(obj.isEmpty());
        // System.out.println(obj.get(1));
        System.out.println(obj.contains(1));
        // obj.sort();
        System.out.println(obj);
        // System.out.println(obj.indexOf(1));
        obj.removeAll(obj1);//we can remove all the common objects present in list1  to list2
        System.out.println(obj);
        System.out.println(obj1);
        obj.retainAll(obj1);//we can delete uncommon obj present inside the obj from obj1
        System.out.println(obj);
        System.out.println(obj1);
    }
}
