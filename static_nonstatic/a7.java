public class a7 {
    public void dance(String name)
    {
        System.out.println(name+": is dancing");
        this.sing("mahesh");
    }
    public void sing(String name)
    {
        System.out.println(name+": is singing");
        this.challange ("sumit");
        // this keyword is used to call non static method inside aother non static method.
    }
    public void challange(String name)
    {
        System.out.println(name+ ": is challanging you");
    }
    public static void main(String[] args) {
        a7 out=new a7();
        out.dance("rohan");
        //out.sing("mahesh");
        //out.challange("sourabh");
    }
}
