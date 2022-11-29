public class asia {
    long size;
    public void continant() {
        System.out.println("I am asia continant");
    }
    public void population() {
        System.out.println("our population is ***********");
    }
    public static void main(String[] args) {
        asia obj=new asia();
        obj.continant();
        obj.population();
        asia a=obj;
        /*a.continant();
        a.population();
        we can do upcasting but we cannot access same methods which is present in same class this is only used for parent class*/
    }
}
