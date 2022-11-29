public class school {
    String name;
    String city;
    int teachers;
    int students;
    double fees;
    school(String nm,String cty,int tno,int sno,double cut){
        this.name=nm;
        this.city=cty;
        this.teachers=tno;
        this.students=sno;
        this.fees=cut;
    }
    school(){

    }
    public String toString(){
        return this.name+"*"+this.city;
    }
    public int hashcode(){
        int c=this.teachers+this.students;
        return c;
    }
}
