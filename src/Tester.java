public class Tester {
    public Tester(){
    }
    public static void main(String[] args){

        Animal animal = new Animal("Nameless");
        Lion lion = new Lion("Leo");
        Cow cow = new Cow("Muu muu");

        animal.animalSound();
        lion.animalSound();
        cow.animalSound();

    }
}
