public class java extends programminglanguage {
    int count;
    String nm;
    public void display2(){
        System.out.println("I am java Programming language");
    }
    public static void main(String[] args) {
        java obj=new java();
        System.out.println(obj.count);
        System.out.println(obj.nm);
        obj.display();
        obj.display2();
    }
}
