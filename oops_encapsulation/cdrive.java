class cdrive
{
     public static void main(String[] args)
    {
        car user1=new car(22,44.5,"black",44,6);
        user1.display();
        // int avarage=user1.getavarage();
        // System.out.println(avarage);
        // double height=user1.getheight();
        // System.out.println(height);
        // String color=user1.getcolor();
        // System.out.println(color);
        // int seatCapacity=user1.getseatCapacity();
        // System.out.println(seatCapacity);
        System.out.println("------------------------");
        user1.setavarage(26);
        // user1.setheight(55.6);
        // user1.setcolor("red");
        // user1.setlength(75);
        // user1.setseatCapacity(7);
        int avarage=user1.getavarage();
        System.out.println(avarage);
    }
}