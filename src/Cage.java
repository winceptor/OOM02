public class Cage {

    private Animal cAnimal;

    public Cage(Animal animal) {
        this.cAnimal = animal;
    }

    public void feedAnimal() {
        System.out.print("Feeding " + this.cAnimal.toString() + "\n");
        this.cAnimal.eat();
    }

    public Animal getAnimal() {
        return this.cAnimal;
    }
}
