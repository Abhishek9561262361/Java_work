public class p2 {
    String sname;
    String srname;
    int srno;
    int classno;
    p2(String snm,String snme,int sno,int cls){
        this.sname=snm;
        this.srname=snme;
        this.srno=sno;
        this.classno=cls;
    }
    p2(){

    }
    public String toString(){
        //by using tostring() method we can create our own address of that method and we can also had that address for better use next time.
        return this.sname+this.srno;
    }
    public int hashcode(){
        //by using this method we can print our address into integer format and also it gives our own address and we can get the simple output.
        return this.srno+this.classno;
    }
}
