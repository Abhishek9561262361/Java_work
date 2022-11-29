public class school1 {
    private String principle;
    private String peon;
    int students;
    private int classes;
    private String sportTeacher;
    private double area;
    school1(String princi,String pname,int count,int cnum,String steacher,double alength)
    {
        this.principle=princi;
        this.peon=pname;
        this.students=count;
        this.classes=cnum;
        this.sportTeacher=steacher;
        this.area=alength;
    }
    public String getprinciple()
    {
        return principle;
    }
    public void setprinciple(String name)
    {
        this.principle=name;
    }
    public String getpeon()
    {
        return peon;
    }
    public void setpeon(String pename)
    {
        this.peon=pename;
    }
    public int getclasses()
    {
        return classes;
    }
    public void setclasses(int number)
    {
        this.classes=number;
    }
    public String getsportTeacher()
    {
        return sportTeacher;
    }
    public void setsportTeacher(String stname)
    {
        this.sportTeacher=stname;
    }
    public double getarea()
    {
        return area;
    }
    public void setarea(double anum)
    {
        this.area=anum;
    }
    public void display() {
        System.out.println("the principle of the school:" +this.principle);
        System.out.println("the peon of the school"+this.peon);
        System.out.println("the total count of the school"+this.students);
        System.out.println("the total number of classes in the school"+this.classes);
        System.out.println("the sport teacher of the school"+this.sportTeacher);
        System.out.println("the total area of the school"+this.area);
    }

}
