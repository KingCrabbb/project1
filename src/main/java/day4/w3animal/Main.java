package w3animal;

public class Main {
    public static void main(String[] args) {
        Cat c = new Cat("vang");
        c.greets();
        Dog d = new Dog("Den");
        Dog d1 = new Dog("Den1");
        d.greets();
        d.greets(d1);
        BigDog bd = new BigDog("Muc");
        BigDog bd1 = new BigDog("Muc1");
        bd.greets();
        bd.greets(d1);
        bd.greets(bd1);
    }
}
