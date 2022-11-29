public class titanic extends hollywood {
    String name3="Titanic";
    int duration3;
    public void display3() {
        System.out.println("I am titanic movie in hollywood");
    }
    public static void main(String[] args) {
        titanic obj=new titanic();
        obj.display();
        obj.display2();
        obj.display3();
        System.out.println("********************");
        titanic t=obj;
        t.display();
        t.display2();
    }
}
