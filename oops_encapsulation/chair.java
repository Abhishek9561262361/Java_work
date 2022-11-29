public class chair {
    private String material;
    private int height;
    private String color;
    private int price;
    private double weight;
    chair(String mt,int ht,String clr,int pr,double wt)
    {
        this.material=mt;
        this.height=ht;
        this.color=clr;
        this.price=pr;
        this.weight=wt;
    }
    public String getmaterial()
    {
        return material;
    }
    public void setmaterial(String name)
    {
        this.material=name;
    }
    public int getheight()
    {
        return height;
    }
    public void setheight(int hname)
    {
        this.height=hname;
    }
    public String getcolor()
    {
        return color;
    }
    public void setcolor(String clur)
    {
        this.color=clur;
    }
    public int getprice()
    {
        return price;
    }
    public void setprice(int prce)
    {
        this.price=prce;
    }
    public double getweight()
    {
        return weight;
    }
    public void setweight(double wt)
    {
        this.weight=wt;
    }
    public void display() {
        System.out.println("the material of the chair is"+this.material);
        System.out.println("the height of the chair is"+this.height);
        System.out.println("the color of the chair is"+this.color);
        System.out.println("the price of the chair is"+this.price);
        System.out.println("the weight of the chair is"+this.weight);
    }
}
