interface a1 {
    void demo();
    static final int a=10;
    static void display() {
        System.out.println("static method");
    }
    public static void main(String[] args) {
        int a=50;
        System.out.println(a);
        a=20;
        System.out.println(a);
        display();
    }
}