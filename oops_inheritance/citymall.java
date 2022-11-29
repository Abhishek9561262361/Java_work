public class citymall extends city {
    String name2="City mall";
    long area2;
    public void display2() {
        System.out.println("I am city mall in pune city");
    }
    public static void main(String[] args) {
        citymall obj=new citymall();
        System.out.println(obj.name);
        System.out.println(obj.name2);
        obj.display();
        obj.display2();
    }
}
