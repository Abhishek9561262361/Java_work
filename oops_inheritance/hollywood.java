public class hollywood extends movie{
    String name2="hollywood";
    double duration2;
    public void display2() {
        System.out.println("I am a hollywood movies");
    }
    public static void main(String[] args) {
        hollywood obj=new hollywood();
        obj.display();
        obj.display2();
        System.out.println("**************");
        hollywood h=obj;
        h.display();
    }
}
