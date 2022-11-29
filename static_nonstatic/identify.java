import java.util.Scanner;

public class identify {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        rev obj=new rev();
        obj.num(n);
        armstrong obj2=new armstrong();
        obj.num(n);
        // fibonesis obj3=new fibonesis();
        // obj3.num(n);
        palindom obj4=new palindom();
        obj4.num(n);
    }
}
