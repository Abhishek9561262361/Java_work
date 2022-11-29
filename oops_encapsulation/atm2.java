class atm2
{
     public static void main(String[] args)
    {
        System.out.println("welcome to axis bank atm");
        System.out.println("------------------------------------------------");
        atm user1=new atm(7889456343l,54522,"rushi gaikwad","saving",0023);
        user1.atmoutput();
        atm user2=new atm(7889456232l,54000,"amit bodake","saving",0024);
        user2.atmoutput();
        atm user3=new atm(7889456454l,54545,"namdev raut","fixed",0025);
        user3.atmoutput();
        atm user4=new atm(7889456645l,54455,"rohan patil","current",0026);
        user4.atmoutput();
        atm user5=new atm(7889456545l,54645,"sourabh bhange","current",0027);
        user5.atmoutput();
    }
}