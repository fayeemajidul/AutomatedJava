public class Main {
    public static void main(String[] args) {
        Human humen  = new Human(true, "Levi");
        Titan titans = new Titan(true);
        attackOnTitanWorld startGame = new attackOnTitanWorld(titans, humen);
        System.out.println(startGame.getHumen().attack());
        System.out.println(startGame.getTitans().defend());
    }
}
