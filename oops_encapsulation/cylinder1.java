public class cylinder1 {
    private double height;
    private double radius;
    cylinder1(Double ht,Double rd){
        this.height=ht;
        this.radius=rd;
    }
    public double getheight(){
        return this.height;
    }
    public void setheight(double ht){
        this.height=ht;
    }
    public double getradius(){
        return this.radius;
    }
    public  void setradius(double rd){
        this.radius=rd;
    }
    public void display(){
        System.out.println("the height of the cylinder is: "+this.height);
        System.out.println("the radius of the cylinder is: "+this.radius);
    }
}
