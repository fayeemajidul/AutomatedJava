public class Main{
    //Loops count from 1-10:
    public static int loopRecorder(){
        //Do While Loop
        int counter = 0;
        boolean stop = false;
        do{
            counter++;
            System.out.println(counter);
            stop = (counter < 10)? true:false;
        }while(stop == true);
        return counter;
    }
    public static void whileLoops(int numEntered){
        int sum = 0;
        int numExtracted = 0;
        while(numEntered > 0){
            numExtracted = numEntered % 10;
            numEntered/=10;
            sum += numExtracted;
            System.out.println(sum);
        }
                
    }
    public static int forLoops(int playerHealth){
        for(int i = 1; i <= 100; i++){
            playerHealth -= 10;
        }
        System.out.println("This will use the same code, but take different application");
        if(playerHealth == 0 || playerHealth < 0){
            System.out.println("Player has died inside");
        }
        return playerHealth;
    }
    public static void forLoops(){
        for(int i = 1; i <= 10; i++){
            System.out.println("Iteration number: " + i);
        }
    }
    public Main(){} // Constructor Method
    public static void main(String[] args) {
        // System.out.println("Testing the environment");
        // System.out.println(loopRecorder());
        // whileLoops(124);
        forLoops(100);

    }
}