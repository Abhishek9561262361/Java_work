class cylinder extends kitchen {
    double height;
    int lenght;
    public void display2(){
        System.out.println("I am a cylinder in kitchen");
    }
    public static void main(String[] args) {
        cylinder obj=new cylinder();
        System.out.println(obj.lnt);
        System.out.println(obj.height);
        obj.display();
        obj.display2();
    }
}
