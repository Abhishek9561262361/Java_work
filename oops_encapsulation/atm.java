public class atm {
    long number;
    int amount;
    String holderName;
    String accountType;
    int pin;
    atm(long no,int rupees,String hname,String actpe,int otp)
    {
        this.number=no;
        this.amount=rupees;
        this.holderName=hname;
        this.accountType=actpe;
        this.pin=otp;
    }
    public void atmoutput()
    {
        System.out.println("the number of this account is "+number);
        System.out.println("the  amount to be decuted is "+amount);
        System.out.println("the holder name of this account is "+holderName);
        System.out.println("the account type of this account is "+accountType);
        System.out.println("the otp of this account is ****");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }
}
