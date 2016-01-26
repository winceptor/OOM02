import java.util.ArrayList;

public class Zoo {

    private int zCagesNumber;

    private int zMaxCages;

    private ArrayList<Cage> zCagesArray;

    public Zoo() {
        this.zCagesNumber = 0;
        this.zMaxCages = 10;
        this.zCagesArray = new ArrayList();
    }

    public Cage checkCage(int number) {
        if (this.zCagesArray.get(number - 1) != null) {
            System.out.print("There is a: " + this.zCagesArray.get(number - 1).getAnimal().getType() + "\n");
        }
        return this.zCagesArray.get(number - 1);
    }

    public void addCage(Cage cage) {
        this.zCagesNumber = this.zCagesNumber + 1;
        this.zCagesArray.add(cage);
    }

    public void listCages() {
        for (int i = 0; i < this.zCagesArray.size(); i++) {
            System.out.print(this.zCagesArray.get(i).getAnimal().toString() + "\n");
        }
    }

    public Cage findCage(String type) {
        for (int i = 0; i < this.zCagesArray.size(); i++) {
            if (type == this.zCagesArray.get(i).getAnimal().getType()) {
                System.out.print("Found: " + this.zCagesArray.get(i).getAnimal().getType() + "\n");
                return this.zCagesArray.get(i);
            }
        }
        return null;
    }

}
