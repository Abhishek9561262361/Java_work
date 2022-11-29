public class fibonesis {
    public static void main(String[] args) {
        int a=0; 
        int b=1;
        int value;
        int n=10;
        for(int i=0;i<=n;i++){
            System.out.println(a);
            value=a+b;
            a=b;
            b=value;
        }
    }
}
