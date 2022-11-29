class bank2
{
     public static void main(String[] args)
    {
        System.out.println("welcome to our bank");
        System.out.println("*********************************************************");
        bank user1= new bank("rohan","saving","RSD2918","YES","EE25142");
        user1.display();
        bank user2= new bank("Mahesh","salary","RSD2919","NO","EE25144");
        user2.display();
        bank user3= new bank("Kiran","saving","RSD52423","YES","EE25262");
        user3.display();
        bank user4= new bank("Suraj","current","RSD4231","YES","EE26524");
        user4.display();
        bank user5= new bank("Akash","salary","RSD21213","NO","EE251214");
        user5.display();
    }
}