public class driver extends y {
    public void display() {
        System.out.println("Display method of class x");
    }
    public void display2() {
        System.out.println("Another display method of class x");
    }
    public void visual() {
        System.out.println("visual method of class y");
    }
    public void visual2() {
        System.out.println("Another visual method of class y");
    }
    public static void main(String[] args) {
        System.out.println("upcasting from driver to y ");
        y obj=new driver();
        obj.display();
        obj.display2();
        obj.visual();
        obj.visual2();
        System.out.println("upcasting from y to x ");
        x obj2=obj;
        obj2.display();
        obj2.display2();
        System.out.println("downcasting from x to y");
        y obj3=(y)obj2;
        obj3.display();
        obj3.display2();
        obj3.visual();
        obj3.visual2();
        System.out.println("downcasting from y to driver class");
        driver obj4=(driver)obj3;
        obj4.display();
        obj4.display2();
        obj4.visual();
        obj4.visual2();
        System.out.println("here is the main method complete");
    }
}
