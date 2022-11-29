public class a6 {
    public void dance(String name)
    {
        System.out.println(name+" :is dancing");
    }
    public static void main(String[] args) {
          a6 d=new a6();
          //static method is also loaded by using constructor and which is given us as a output.
          d.dance("rahul");
    }
}
