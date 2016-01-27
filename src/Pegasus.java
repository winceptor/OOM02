public class Pegasus extends Animal implements Fly, Run {

    public Pegasus() {
        super();
        this.setType("Pegasus");
    }

    @Override
    public void fly() {
        System.out.print("Pegasus tries to fly.\n");
    }

    @Override
    public void run() {
        System.out.print("Pegasus runs in circles.\n");
    }
    
    @Override
    public void doTricks()
    {
        this.fly();
        this.run();
    }
}
