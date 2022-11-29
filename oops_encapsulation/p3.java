public class p3 {
    String name;
    String village;
    int salary;
    String company;
    int joinYear;
p3(String nme,String vlg,int sal,String cmp,int jyear)
{
    this.name=nme;
    this.village=vlg;
    this.salary=sal;
    this.company=cmp;
    this.joinYear=jyear;
}
public void details()
{
    System.out.println("the name of the employee is: "+name);
    System.out.println("the village of the employee is: "+village);
    System.out.println("the salary of the employee is: "+salary);
    System.out.println("the company of the employee is: "+company);
    System.out.println("the join year of the employee is: "+joinYear);
}
}
