public class driver2 {
    public static void main(String[] args) {
        school sc=new school("sadguru","islampur",22,300,5000.55);
        school sc2=new school("adarsh","islampur",30,500,6000.55);
        school sc3=new school("hsc","ashta",39,300,5000.66);
        System.out.println("***** address of the value  *******");
        System.out.println(sc.toString());
        System.out.println(sc2.toString());
        System.out.println(sc3.toString());
        System.out.println("******* address in integer *******");
        System.out.println(sc.hashCode());
        System.out.println(sc2.hashCode());
        System.out.println(sc3.hashCode());
    }
}
