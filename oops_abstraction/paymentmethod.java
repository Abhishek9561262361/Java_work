import java.util.Scanner;

public class paymentmethod extends phonepe{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your amount");
        int amt=sc.nextInt();
        System.out.println("coustomer enter your choice");
        System.out.println("1.googlepay /n 2.phonepe /n 3.paytm");
        int n=sc.nextInt();
        paymentmethod p=new paymentmethod();
        switch(n){
            case 1:p.googlepay(amt);
                 break;
            case 2:p.phonepemoney(amt);
                 break;
            case 3:p.paytmmoney(amt);
                 break;
            default:System.out.println("enter valid key");
        }
    }
}
