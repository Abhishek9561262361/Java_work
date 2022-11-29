import java.util.HashSet;

public class p2 {
    public static void main(String[] args) {
         HashSet obj=new HashSet();
         obj.add(1);
         obj.add(2);
         obj.add(7);
         obj.add(5);
         obj.add(4);
         HashSet obj1=new HashSet<>();
         obj1.add(2);
         obj1.add(4);
         obj1.add(7);
         obj1.add(8);
         obj1.add(9);
         System.out.println(obj1);
        //  obj.add(1,2);// this method is not applicable for the hashset value.
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
