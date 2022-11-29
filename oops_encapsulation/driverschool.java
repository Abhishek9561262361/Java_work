public class driverschool {
    public static void main(String[] args) {
        school obj=new school("karmayogi engineering college panfharpur","sp patil",8000,26,46,"pandharpur",6000);
        obj.display();
        obj.setprincipal("rajendra patil");
        obj.setfees(5000);
        obj.setclasess(86);
        obj.setcity("sangli");
        System.out.println("***********************");
        obj.display();
    }
}
