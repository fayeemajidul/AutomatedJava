public class Main{
    public static void main(String[] args){
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        System.out.println(animal);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Silky");
        dog.eat();
        dog.run();
        dog.walk();

    }
}