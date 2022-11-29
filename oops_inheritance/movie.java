public class movie {
    String name="movies";
    double duration;
    public void display() {
        System.out.println("I am a movies");
    }
    public static void main(String[] args) {
        movie obj=new movie();
        obj.display();
        movie m=obj;
    }
}
