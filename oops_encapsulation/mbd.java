public class mbd {
    public static void main(String[] args) {
        mb obj=new mb("nord5G","one plus",25000,256,"android",5000);
        obj.display();
        obj.setmbcompany("iphone");
        obj.setprice(40000);
        System.out.println("the updated mobile name: "+obj.getmbcompany());
        System.out.println("the new price is: "+obj.getprice());
    }
}
