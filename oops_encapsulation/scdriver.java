class scdriver
{
     public static void main(String[] args)
    {
        school1 user1=new school1("PMModi","amitShaha",200,21,"harshal patel",222.42);
        String principle=user1.getprinciple();
        System.out.println(principle);
        String peon=user1.getpeon();
        System.out.println(peon);
        int classes=user1.getclasses();
        System.out.println(classes);
        String sportTeacher=user1.getsportTeacher();
        System.out.println(sportTeacher);
        double area=user1.getarea();
        System.out.println(area);
        System.out.println("------------------------------------------------------------");
        user1.setprinciple("rahul gandhi");
        System.out.println("the new principle is: "+user1.getprinciple());
        user1.setpeon("narendra modi");
        System.out.println("the new peon is: "+user1.getpeon());
        user1.setclasses(202);
        System.out.println("the updated classrooms are "+user1.getclasses());
        user1.setsportTeacher("MSDhoni");
        System.out.println("the updated sport teacher is: "+user1.getsportTeacher());
        user1.setarea(222.32);
        System.out.println("the school area is: "+user1.getarea());
        System.out.println("-------------------------------------------");
        user1.display();
    }
}