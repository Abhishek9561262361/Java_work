public class p7 {
    public static void main(String[] args) {
        byte a=10;
        String s=String.valueOf(a);
        System.out.println(s);
        System.out.println(a);
        //string to byte
        String sc="apple";
        byte b=Byte.parseByte(sc);
        System.out.println(sc);
        System.out.println(b);//throws number format exception.
    }
}
