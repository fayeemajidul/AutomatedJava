public class ClimbingStairs{
    //Instance FIeld:
    public static void numberOfStepsPath(int numberOfStairs){
        int pathOne = 0;
        int remainderOfSteps = (numberOfStairs%2); //Will give me the remaining amount of steps. -> 

        for(int i = 0; i < numberOfStairs; i++){
            if(numberOfStairs/1 == 0){
                pathOne +=1;
                break;
            }else if(numberOfStairs%2 == 0){
                pathOne +=1;
            }else if (remainderOfSteps - 1 == 0){
                pathOne +=1;
            }else{
                System.out.println("Impossible to go up these stairs");
            }
        }
        System.out.println(pathOne);
    }

    public static void main(String[] args){
        numberOfStepsPath(3121);
    }
}

//We're just looking for factors here.