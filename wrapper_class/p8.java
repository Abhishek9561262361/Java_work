public class p8 {
    public static void main(String[] args) {
        //short to string
        short t=20;
        String sc=String.valueOf(t);
        System.out.println(t);
        System.out.println(sc);
        //string to short
        String s="abhi";
        short s1=Short.parseShort(s);
        System.out.println(s);
        System.out.println(s1);//throws the numberformalexcption.
    }
}
