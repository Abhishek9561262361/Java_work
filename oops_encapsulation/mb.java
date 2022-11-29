public class mb {
    String mbName;
    private String mbCompany;
    private int price;
    int storage;
    String processor;
    int battery;
    mb(String mn,String mbc,int pr,int strg,String prc,int bat){
        this.mbName=mn;
        this.mbCompany=mbc;
        this.price=pr;
        this.storage=strg;
        this.processor=prc;
        this.battery=bat;
    }
    public String getmbcompany(){
        return mbCompany;
    }
    public void setmbcompany(String name){
        this.mbCompany=name;
    }
    public int getprice(){
        return price;
    }
    public void setprice(int value){
        this.price=value;
    }
    public void display(){
        System.out.println("the moblie name is: "+mbName);
        System.out.println("the moblie company is: "+mbCompany);
        System.out.println("the moblie price is: "+price);
        System.out.println("the moblie storage is: "+storage);
        System.out.println("the moblie processor is: "+processor);
        System.out.println("the moblie battery is: "+battery);
    }
}
