public class driver {
    public static void main(String[] args) {
        india1 obj=new india1();
        System.out.println("Without using upcating and downcasting");
        System.out.println("---------------------------------------");
        obj.name1();
        obj.count();
        obj.number();
        obj.water();
        obj.countries();
        obj.number2();
        obj.states();
        obj.cities();
        System.out.println("********************");
        System.out.println("upcasting");
        continent c=obj;
        c.name1();
        c.count();
        c.number();
        c.water();
        c.countries();
        c.number2();
        //c.states(); it gives an error bcoz we cannot call child class member in it.
        //c.cities();it gives an error bcoz we cannot call child class member in it.
        System.out.println("********************");
        earth e=c;
        e.name1();
        e.count();
        e.number();
        e.water();
        //further methods is of child class so that we cannot call that methods bocz it child class methods
        System.out.println("********************");
        galaxy g=e;
        g.name1();
        g.count();
        //further methods is not called bcoz it has some meaning but it has diff class it is child class members.
        System.out.println("********************");
        System.out.println("downcasting");
        earth e2=(earth)g;
        e2.name1();
        e2.count();
        e2.number();
        e2.water();
        System.out.println("********************");
        continent c2=(continent)e2;
        c2.name1();
        c2.count();
        c2.number();
        c2.water();
        c2.countries();
        System.out.println("********************");
        earth e3=(earth)c2;
        e3.name1();
        e3.count();
        e3.number();
        e3.water(); 
    }
}
