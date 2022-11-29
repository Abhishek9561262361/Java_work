class romemates
{
     
        String name;
        int age;
        String deptname;
        String city;
        int distance;
    romemates(String rname,int rage,String dname,String cty,int distnce)
    {
        this.name = rname;
        this.age = rage;
        this.deptname = dname;
        this.city = cty;
        this.distance = distnce;
    }
    public void display()
    {
        System.out.println("the name of our romemate is "+name);
        System.out.println("the age of our romemate is "+age);
        System.out.println("the deptname of our romemate is "+deptname);
        System.out.println("the city of our romemate is "+city);
        System.out.println("the distance of our romemate from home is "+distance);
        System.out.println("----------------------------------------------------------");
    }
}