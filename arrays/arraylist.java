import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            a.add(i);
        }
        System.out.println(a);
    }
}
