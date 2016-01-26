public class Griffin extends Animal implements Fly, Run, Shout {

    public Griffin() {
        super();
        this.setType("Griffin");
    }

    @Override
    public void fly() {
        System.out.print("Griffin flies a bit.\n");
    }

    @Override
    public void run() {
        System.out.print("Griffin runs around.\n");
    }

    @Override
    public void shout(String shout) {
        System.out.print("Griffin shouts: " + shout + "\n");
    }
}
