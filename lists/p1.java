import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class p1 {
    public static void main(String[] args) { 
        ArrayList<Integer> obj=new ArrayList<>();
        //add is the method which is used to add some elements in it.
        obj.add(1);
        obj.add(20);
        obj.add(90);
        obj.add(88);
        System.out.println(obj);
        //isEmpty() is the method which is used to check the given method is empty or not.
        // System.out.println(obj.isEmpty());
        ArrayList<Integer> obj1=new ArrayList<>();
        obj1.add(40);
        obj1.add(29);
        obj1.add(83);   
        obj1.add(43);
        System.out.println(obj1);
        // obj.addAll(obj1);//this is the way we can add all values of list2 into list1.
        // obj1.addAll(obj);//this is the way we can add all values of list1 into list2.
        // System.out.println(obj);
        // System.out.println(obj1);
        System.out.println(obj.get(2));//this is the way we get the value which is present at index 2 and we get output.
        //same when we insert get(0) we get 40 , get(1) we get 29 and all thats why we get output.
        System.out.println(obj.contains(29));// we get the object which we pass throw this content and we get output of that value. same as obj.contains(40) it gives 40 output.
        System.out.println(obj.indexOf(20));// we can get the index of the given object with the hlp of the indexof and pssing value.
        //for loop.
        //this is the general for loop which is used to get the values present in given arraylist.
        for (int i = 0; i <obj.size(); i++) {
            System.out.println(i+" index is "+obj.get(i));
        }
        //advanced for loop.
        //as we seen below we can create object and pass any ref_var and we get the object of the given arraylist
        for(Object v:obj){
            System.out.println(v);
        }
        Collections.sort(obj);//this is the way in which we can sort the values which is present inside the given arraylist and we get output.
        //for this we have to import the collection package and we get the output easily otherwise it asked what is this collection.
        Collections.sort(obj1);
        System.out.println(obj1);
        System.out.println(obj);
        Collections.reverse(obj);//this is the way in which we can get the given arraylist which is in the reverse order and hence we have proper output.
        System.out.println(obj);
        Collections.sort(obj);//this gives the given list in the sorted form and hence we get the output with sorted form.
        System.out.println(obj);
        Iterator it=obj.iterator();//this is the another method for the given arraylist to print the all values present in the given table.
        //just like for loop we have to pass iterator for obj and use hasnext() to ask it is present or not.
        while(it.hasNext()){
            System.out.println(it.next());
        }
        obj.remove(2);//as we seen from above output we can get remove the value present in that index and hence we get the output.
        System.out.println(obj);
        obj.remove(Integer.valueOf(20));//as we see from above output we can remove the value present in that arraylist and hence we get the output.
        System.out.println(obj);
        obj.removeAll(obj1);//as we seen from output it can remove the same value present in obj1 from obj.
        System.out.println(obj);
        System.out.println(obj1);
        obj.retainAll(obj1);//this is the way we can remove the uncommon values present inside the obj from obj1.
        System.out.println(obj);
        System.out.println(obj1);
    }
}
