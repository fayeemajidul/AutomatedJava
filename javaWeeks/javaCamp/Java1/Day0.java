import java.util.Scanner;
public class Day0{
    //Instance Variables:
    public Day0(){} //Constructor Class
    //Create a program that when the user inputs a number it spits out the words back in letters:
    public static int reverseNumber(int numberEntered){
        int reverseNum = 0;
        if(numberEntered < 0){
            return -1; // Because its not a valid number
        }
        while(numberEntered > 0){
            int digitsExtracted = (numberEntered%10);
            reverseNum += digitsExtracted;
            reverseNum *= 10;
            numberEntered/=10;
        }
        reverseNum/=10;
        return reverseNum;
    }
    public static void parsingStringValues(){
        //Java has classes that let you  go from one datatype to another
        String playerDayAge = "20131";
        int playerAccountAge = Integer.parseInt(playerDayAge);
        System.out.println("Player has spent " + playerAccountAge + " days on the game"); 

        int UNACCOUNTEDDAYS = 365;
        playerAccountAge += UNACCOUNTEDDAYS;
        System.out.println("With unaccounted days, the player has spent " + playerAccountAge + " days on the game"); 

    }
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        //Setting Converstions:
        int kgBig = bigCount * 5;
        int totalKG = (kgBig + smallCount);
        //
        if(goal % totalKG == 0){
            return true;
        }else if(goal % totalKG > 0 && smallCount == 0){
            return false;
        }else if(goal % totalKG > 0 && goal % smallCount > 0){
            return true;
        }else if(goal % totalKG < 0 || goal % totalKG > 0){
            return false;
        }
        return false;
    }
    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }

        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int allFactors(int number){
        for(int i = 1; i < number; i++){
           if(number%i==0){
            boolean primeNumberVerify = isPrime(i);
            if(primeNumberVerify){
                System.out.println("the number " + i + " is both prime and a factor");
                //Create code that compares both values and spits out higher value:
                }
            }
        }
        return -1;
    }
    public static void userInput(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello user enter name");
        String name = userInput.nextLine();
        System.out.println("Hello " + name);
        userInput.close();

    }
    public static void sumOfUserInput(){ 
        int sumOfNumbers = 0;
        Scanner userEntry = new Scanner(System.in);

        for(int i = 0; i <10; i++){
            System.out.println("Please enter the number");
            Integer numberEntered = userEntry.nextInt();
            sumOfNumbers += numberEntered;
        }
        System.out.println(sumOfNumbers);
        userEntry.close();
    }

    public static void main(String[] args){
        //allFactors(217);
        sumOfUserInput();
    }
}

//Finished Loops Officially Going on to Classes: