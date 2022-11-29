public class steam extends tree {
    String name2;
    public void display2(){
        System.out.println("I am a steam of tree");
    }
    public static void main(String[] args) {
        steam obj=new steam();
        System.out.println(obj.name);
        System.out.println(obj.name2);
        obj.display();
        obj.display2();
    }
}
