public class Bird extends Animal implements Fly {

    public Bird() {
        super();
        this.setType("Bird");
    }

    @Override
    public void fly() {
        System.out.print("Bird flies a bit.\n");
    }
}
