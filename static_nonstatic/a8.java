public class a8 {
    //non static block
    {
        System.out.println("ns blcok");
    }
    public static void main(String[] args) {
        a8 obj=new a8();
        //this is the starting of ns block and as we seen from the code there is working of ns block without using the constructor
        System.out.println(obj);
    }
}
