public class state extends india{
    long size3;
    public void touristplace() {
        System.out.println("So many tourist places come in maharasshtra");
    }
    public void districts() {
        System.out.println("there are lot of districts in maharshtra");
    }
    public static void main(String[] args) {
        state obj=new state();
        obj.touristplace();
        obj.districts();
        obj.population();
        obj.continant();
        obj.nature();
        obj.religion();
        System.out.println("***********************************");
        state s=obj;
        s.population();
        s.continant();
        s.nature();
        s.religion();
    }
}
