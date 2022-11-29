class bolero extends cars{
    int size;
    String colour;
    public void dis2(){
        System.out.println("I am red coloured car");
    }
    public static void main(String[] args) {
        bolero obj=new bolero();
        obj.display();
        obj.dis2();
    }
}
