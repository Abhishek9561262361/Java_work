class driver1{
    public static void main(String[] args) {
        employeee emp=new employeee("suraj",85000.2,2201,2201);
        employeee emp2=new employeee("nitin",95000.3,2302,8975);
        employeee emp3=new employeee("rajesh",98565.44,8858,6656);
        employeee emp4=new employeee("abhi",100000.55,9855,6655);
        System.out.println("******address is************");
        System.out.println(emp.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        System.out.println(emp4.toString());
        System.out.println("******in integer************");
        System.out.println(emp.hashcode());
        System.out.println(emp2.hashcode());
        System.out.println(emp3.hashcode());
        System.out.println(emp4.hashcode());
        // System.out.println(emp.toString());
    }
}