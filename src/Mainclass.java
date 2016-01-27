public class Mainclass {

    public static void main(String[] args) {
        Zoo newZoo = new Zoo();
        
        Bird newBird = new Bird();
        Cage newCage1 = new Cage(newBird);
        newZoo.addCage(newCage1);
        newBird.doTricks();
        System.out.println();
        
        Horse newHorse = new Horse();
        Cage newCage2 = new Cage(newHorse);
        newZoo.addCage(newCage2);
        newHorse.doTricks();
        System.out.println();
        
        Pegasus newPegasus = new Pegasus();
        Cage newCage3 = new Cage(newPegasus);
        newZoo.addCage(newCage3);
        newPegasus.doTricks();
        System.out.println();
        
        Cage cage2 = newZoo.checkCage(2);
        cage2.getAnimal();
        System.out.println();
        
        Cage pegasusCage = newZoo.findCage("Pegasus");
        if (pegasusCage != null) {
            pegasusCage.feedAnimal();
        }
        System.out.println();
        
        Animal happyBird;
        happyBird = newZoo.findCage("Bird").getAnimal();
        happyBird.nameAnimal("Happy");
        happyBird.doTricks();
        happyBird.eat();
        System.out.println();
        
        Griffin newGriffin = new Griffin();
        Cage newCage4 = new Cage(newGriffin);
        newZoo.addCage(newCage4);
        newGriffin.doTricks();
        System.out.println();
        
        Platypus newPlatypus = new Platypus();
        Cage newCage5 = new Cage(newPlatypus);
        newZoo.addCage(newCage5);
        newPlatypus.run();
        newPlatypus.shout("I will lay some eggs!");
        newPlatypus.layEggs();
        System.out.println();
         
    }
}
