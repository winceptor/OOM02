public class Platypus extends Animal implements Shout, LayEggs, Run {

    public Platypus() {
        super();
        this.setType("Platypus");
    }

    @Override
    public void layEggs() {
        System.out.print("Platypus lays some eggs.\n");
    }

    @Override
    public void run() {
        System.out.print("Platypus runs around.\n");
    }

    @Override
    public void shout(String shout) {
        System.out.print("Platypus shouts: " + shout + "\n");
    }
}
