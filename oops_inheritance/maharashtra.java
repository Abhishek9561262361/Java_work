class maharashtra extends country {
    String name2="Maharashtra";
    long area2;
    public void display2(){
        System.out.println("i am maharashtra state in country india");
    }
    public static void main(String[] args) {
        maharashtra obj=new maharashtra();
        System.out.println(obj.name2);
        System.out.println(obj.name);
        obj.display();
        obj.display2();
    }
}
