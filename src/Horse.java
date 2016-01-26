public class Horse extends Animal implements Run {

    public Horse() {
        super();
        this.setType("Horse");
    }

    @Override
    public void run() {
        System.out.print("Horse runs around.\n");
    }
}
