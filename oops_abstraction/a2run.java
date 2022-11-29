public class a2run extends a2 {
    public void game(){
        System.out.println("game method of abstract class");
    }
    public static void main(String[] args) {
        a2 obj=new a2run();
        obj.demo();
        obj.game();
        // we can also write the method of the given class with the help of overriding the method.
    }
}
