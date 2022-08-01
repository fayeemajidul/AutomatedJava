public class Main{
    //Instance Field:
    //Constructor Method:
    public Main(){}

    public static void main(String[] args) {
        Health health = new Health();
        Attack attack = new Attack(100, 20, health);
        attack.specialMove3();
    }
}