public class Main{
    //Instance Field:
    //Constructor Method:
    public Main(){}
    public static void main(String[] args) {
        Animals animals = new Animals("Dory", 1, 2);
        Nature nature = new Nature(7, 2, 31);
        Human human = new Human("Joe", 21, 1, 2);
        World helloWorld = new World(human, nature, animals);
        helloWorld.worldFormation();
    }
}