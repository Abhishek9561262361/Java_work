import java.util.Scanner;

public class perfect {
    public void num(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum=sum+i;
                }
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        perfect obj=new perfect();
        obj.num(n);
    }
}
