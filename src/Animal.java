public abstract class Animal {

    private int aWeight;

    private String aName;

    private String aType;

    public Animal() {
        this.aWeight = 1;
        this.aName = "Unnamed";
        this.aType = "Unknown";
    }

    public void eat() {
        System.out.print(this.aName + " " + this.aType + " eats something and weights now: " + this.aWeight + "kg \n");
        this.aWeight = this.aWeight + 1;
    }

    public void nameAnimal(String name) {
        this.aName = name;
        System.out.print(this.aType + " is now called " + this.aName + "\n");
    }

    public String toString() {
        return this.aName + " " + this.aType;
    }

    public void setType(String type) {
        this.aType = type;
    }

    public String getType() {
        return this.aType;
    }
}
