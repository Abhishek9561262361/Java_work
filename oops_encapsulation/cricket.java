public class cricket extends game{
    //Method overriding.
    public void players() {
        System.out.println("this is the method of the class cricket");
    }
    public static void main(String[] args) {
        cricket c=new cricket();
        c.players();
        game g=c;
        g.players();
        //method overriding is the method of the method which has same method signature in child  and parent class.
    }
}
