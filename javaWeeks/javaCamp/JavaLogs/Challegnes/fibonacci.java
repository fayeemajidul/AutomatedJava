

public class fibonacci{
    static int grades[] = {0,1,2,3,4,5,6,7,8,9};
    int legsOntable = 10;

    public fibonacci(){}
    //ArrayList <String> lettersInAlphabet = new ArrayList<String>();    

    public static void sequencing(){
        int temp = 0;
        for(int i = 0; i < grades.length-1; i++){
            // System.out.println(grades[i] + ", " + i);
            temp = grades[i] + grades[i+1];
            grades[i+1] = temp;
            temp = 0;
            System.out.println(i + ": " + grades[i]);
        }
    }
    
    public static void main(String[] args) {
        sequencing();
    }
}