package w3animal;

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woof");
    }
    public void greets(Dog othor){
        System.out.println("Woooof");
    }
}
