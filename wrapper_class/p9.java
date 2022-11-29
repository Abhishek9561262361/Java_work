public class p9 {
    public static void main(String[] args) {
        //long to string
        long l=203;
        String s=String.valueOf(l);
        System.out.println(s);
        System.out.println(l);
        //string to long
        String sc="abhi";
        long l1=Long.parseLong(sc);
        System.out.println(sc);
        System.out.println(l1);//throws the exception that number format exception.
    }
}
