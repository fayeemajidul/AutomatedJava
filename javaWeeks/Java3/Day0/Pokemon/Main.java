public class Main{
    //Instance Field:
    //Constructor Method:
    public Main(){}

    public static void main(String[] args) {
        //User1:
        Health health = new Health();
        Attack attack = new Attack(100, 20, health);
        Pokemon user1 = new Pokemon("Fayeem", attack, health);
        user1.lostInThoughts();
        //User2
        Health health2 = new Health();
        Attack attack2 = new Attack(100, 20, health2);
        Pokemon user2 = new Pokemon("Computer", attack2, health2);
        user2.lostInThoughts();
        user2.userProfile();
    }
}