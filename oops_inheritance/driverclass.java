public class driverclass {
    public static void main(String[] args) {
        System.out.println("to load all the static methods without using constructor*******");
        r.run();
        r.run2();
        q.visual();
        q.visual2();
        p.display();
        p.display2();
        System.out.println("To create object for loading all non static members");
        r obj=new r();
        obj.run3();
        obj.run4();
        obj.visual3();
        obj.visual4();
        obj.display3();
        obj.display4();
        System.out.println("lets upcast r to q");
        q obj2=obj;
        obj2.visual3();
        obj2.visual4();
        obj2.display3();
        obj2.display4();
        // obj2.run3()   -------> it is not possible because it cannot display child class members
        //obj2.run4()  ---------> IT is not possible beacause it cannot display child class members.
        System.out.println("lets upcast q to p");
        p obj3=obj2;
        obj3.display3();
        obj3.display4();
        //obj.visual3(); ----------->it is not possible because it cannot display child class members
        //obj.visual4();  ------------->it is not possible because it cannot display child class members
        // obj.run3(); --------->it is not possible because it cannot display child class members
        // obj.run4(); -------->it is not possible because it cannot display child class members
        System.out.println("lets do downcating of class p to q");
        q down=(q)obj3;
        down.display3();
        down.display4();
        down.visual3();
        down.visual4();
        System.out.println("lets do downcating of class q to r");
        r down2=(r)down;
        down2.display3();
        down2.display4();
        down2.visual3();
        down2.display4();
        down2.run3();
        down2.run4();
        System.out.println("now here we can done all upcating and downcating ");
    }
}
