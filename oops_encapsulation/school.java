public class school {
    String name;
    private String principal;
    private int fees;
    private int clasess;
    private int teachers;
    private String city;
    int student;
    school(String nme,String prn,int fe,int clas,int teach,String cty,int std){
        this.name=nme;
        this.principal=prn;
        this.fees=fe;
        this.clasess=clas;
        this.teachers=teach;
        this.city=cty;
        this.student=std;
    }
    public String getprincipal(){
        return this.principal;
    }
    public int getfees(){
        return this.fees;
    }
    public int getclasess(){
        return this.clasess;
    }
    public int getteachers(){
        return this.teachers;
    }
    public String getcity(){
        return this.name;
    }
    public void setprincipal(String pname){
        this.principal=pname;
    }
    public void setfees(int fee){
        this.fees=fee;
    }
    public void setclasess(int cls){
        this.clasess=cls;
    }
    public void setteachers(int teacher){
        this.teachers=teacher;
    }
    public void setcity(String cty){
        this.city=cty;
    }
    public void display() {
        System.out.println("the name of the school is"+this.name);
        System.out.println("the principal of the school is"+this.principal);
        System.out.println("the fee of the school is"+this.fees);
        System.out.println("the clasess of the school is"+this.clasess);
        System.out.println("the teachers of the school is"+this.teachers);
        System.out.println("the city of the school is"+this.city);
        System.out.println("the total student of the school is "+this.student);
    }
}
