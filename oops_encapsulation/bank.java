public class bank {
    String name;
    String accountType;
    String coustomerId;
    String nominee;
    String IFSCCode;
    bank(String cname,String atype,String cid,String nomine,String icode)
    {
        this.name=cname;
        this.accountType=atype;
        this.coustomerId=cid;
        this.nominee=nomine;
        this.IFSCCode=icode;
    }
    public void display()
    {
        System.out.println("the name of account holder is "+name);
        System.out.println("the account type of account holder is "+accountType);
        System.out.println("the coustomer id of account holder is "+coustomerId);
        System.out.println("can nominee of account holder is "+nominee);
        System.out.println("the IFSCCode of account holder is "+IFSCCode);
        System.out.println("------------------------------------------------------");
    }
}
