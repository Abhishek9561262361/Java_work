public class pune extends state{
    long size4;
    public void colleges() {
        System.out.println("there is so many colleges in pune");
    }
    public void fort() {
        System.out.println("In pune there are so many forts");
    }
    public static void main(String[] args) {
        pune obj=new pune();
        obj.colleges();
        obj.fort();
        obj.continant();
        obj.population();
        obj.nature();
        obj.religion();
        obj.districts();
        obj.touristplace();
        System.out.println("*******************************");
        pune p=obj;
        p.continant();
        p.population();
        p.nature();
        p.religion();
        p.districts();
        p.touristplace();
    }
}
