public class p11 {
    public static void main(String[] args) {
        //boolean to string.
        boolean b=true;
        String s=String.valueOf(b);
        System.out.println(b);
        System.out.println(s);
        //string to boolean
        String s2="false";
        boolean b2=Boolean.parseBoolean(s2);
        System.out.println(s2);
        System.out.println(b2);
    }
}
