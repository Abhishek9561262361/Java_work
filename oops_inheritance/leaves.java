public class leaves extends tree {
    String name3;
    public void display3(){
        System.out.println("I am leaves of the tree");
    }
    public static void main(String[] args) {
        leaves obj=new leaves();
        System.out.println(obj.name3);
        System.out.println(obj.name);
        obj.display();
        obj.display3();
    }
}
