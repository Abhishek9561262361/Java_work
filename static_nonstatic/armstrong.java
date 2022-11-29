public class armstrong {
    public void num(int n){
        int arm=0;
        int r=0;
        while(n>0){
            r=n%10;
            arm=(r*r*r)+arm;
            n=n/10;
        }
        if(n==arm){
            System.out.println("it is armstrong number");
        }
        else{
            System.out.println("non armstrong number");
        }
    }
}
