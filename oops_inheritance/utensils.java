class utensils extends kitchen {
    int count=20;
    public void display3(){
        System.out.println("I am utensils in kitchen");
    }
    public static void main(String[] args) {
        utensils obj=new utensils();
        System.out.println(obj.count);
        System.out.println(obj.ht);
        obj.display();
        obj.display3(); 
    }
}
