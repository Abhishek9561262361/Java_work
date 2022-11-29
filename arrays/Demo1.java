package practice.string;

import java.util.ArrayList;

public class Demo1 {
 public static void  main(String args[])
 {
  ArrayList<Integer> b=new ArrayList<Integer>();
  b.add(10);
  b.add(50);
  b.add(30);
  b.add(5);
  b.add(40);
  b.add(60);
  b.add(55);
  b.add(15);
  b.add(25);
  b.add(70);
  System.out.println(b);
  System.out.println("removing four element");
  b.remove(2);
  b.remove(4);
  b.remove(7);
  System.out.println(b);
  System.out.println("sorting the arraylist");
  b.sort(null);
  System.out.println(b);
 
 }

}