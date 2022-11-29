public class p3 {
    public static void main(String[] args) {
        p2 obj=new p2("abhi", "mane", 221,10);
        System.out.println(obj.toString());
        p2 obj1=new p2("mahesh", "lomate", 222, 10);
        System.out.println(obj1.toString());
        p2 obj3=new p2("namdev", "raut", 223, 10);
        System.out.println(obj3.toString());
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj3.hashCode());    
    }
}