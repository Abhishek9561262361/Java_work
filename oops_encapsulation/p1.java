public class p1 {
    String mobileName;
    String processor;
    int ram;
    int storage;
    int battery;
    p1(String mbname,String process,int rom,int strg,int batry)
    {
        this.mobileName = mbname;
        this.processor = process;
        this.ram = rom;
        this.storage= strg;
        this.battery= batry;
    }
    public void display()
    {
        System.out.println("the name of mobile is "+mobileName);
        System.out.println("the processor of that mobile is "+processor);
        System.out.println("the processor of that ram is "+ram);
        System.out.println("the processor of that storage is "+storage);
        System.out.println("the processor of that battery is "+battery);
        System.out.println("---------------------------------------------");
    }
}
