class chdriver
{
     public static void main(String[] args)
    {
        chair user1=new chair("wood",44,"green",220,50.44);
        String material=user1.getmaterial();
        System.out.println(material);
        int height=user1.getheight();
        System.out.println(height);
        String color=user1.getcolor();
        System.out.println(color);
        int price=user1.getprice();
        System.out.println(price);
        double weight=user1.getweight();
        System.out.println(weight);
        System.out.println("------------------------------------------------------------");
        user1.setmaterial("plastic");
        //System.out.println("the new principle is: "+user1.getmaterial());
        user1.setheight(55);
        //System.out.println("the new peon is: "+user1.getweight());
        user1.setcolor("red");
        //System.out.println("the updated classrooms are "+user1.getcolor());
        user1.setprice(550);
        //System.out.println("the updated sport teacher is: "+user1.getprice());
        user1.setweight(20.55);
        //System.out.println("the school area is: "+user1.getweight());
        //System.out.println("-------------------------------------------");
        user1.display();
    }
}