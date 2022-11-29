class employeee
{
    String ename;
    double esal;
    int eid;
    int pan;
    employeee(String enme,double sal,int id,int pno)
    {
        this.ename=enme;
        this.esal=sal;
        this.eid=id;
        this.pan=pno;
    }
    // we can pass default constructor bcoz when we create the object if we forget to pass the instruction then atleast default get printed.
    employeee(){
        
    }
    // this command is used to print address which we want just we override the method and do some changes and print it according to our requirement
    public String toString(){
        return "INF"+"*"+ename;
    }
    // this command is used to print address in integer form with the help of the  hashcode method and we get the output according to that.
    public int hashcode(){
        int c=this.pan+this.eid;
        return  c;
    }
}