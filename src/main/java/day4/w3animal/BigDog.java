package w3animal;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }

    @Override
    public void greets() {
        System.out.println("Woow");;
    }

    @Override
    public void greets(Dog othor) {
        System.out.println("Woooooow");;
    }
    public void greets(BigDog bd){
        System.out.println("Woooooooooow");
    }
}
