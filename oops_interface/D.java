class D extends A implements B,C
{
    public void meth2() {
        System.out.println("I am method of class B");
    }
    public void meth3() {
        System.out.println("I am method of class C");
    }
    public static void main(String[] args) {
        D obj=new D();
        obj.meth();
        obj.meth2();
        obj.meth3();
    }
}