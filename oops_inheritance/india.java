public class india extends asia {
    long size2;
    public void nature() {
        System.out.println("India's nature is so great");
    }
    public void religion() {
        System.out.println("there is so many religions in india");
    }
    public static void main(String[] args) {
        india obj=new india();
        obj.continant();
        obj.population();
        obj.nature();
        obj.religion();
        System.out.println("*******************************");
        india i=obj;
        i.continant();
        i.population();
    }
}
