class a1
{
    int a=10;
    public void dance(){
        System.out.println("dance method");
    }
    a1(int x){
        System.out.println(x);
    }
    a1(){
        System.out.println("comstructor block a1");
    }
    {
        System.out.println("non static block");
    }
}