public class pvr extends citymall {
    String name3="movie theater";
    long area3;
    public void display3() {
        System.out.println("I am a pvr movie theater in city mall of pune city");
    }
    public static void main(String[] args) {
        pvr obj=new pvr();
        System.out.println(obj.name);
        System.out.println(obj.name2);
        System.out.println(obj.name3);
        obj.display();
        obj.display2();
        obj.display3();
    }
}
