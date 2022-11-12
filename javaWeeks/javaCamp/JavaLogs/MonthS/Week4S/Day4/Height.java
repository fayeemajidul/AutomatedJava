import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Height{
    public static void main(String[] args) {
        ArrayList <Integer> studentHeight = new ArrayList<>();
        sortHeight(studentHeight);
    }
    public static ArrayList<Integer> classHeight(ArrayList<Integer> studentHeight){
        Random rand = new Random();
        for(int i = 0; i < rand.nextInt(5,15); i++){
            studentHeight.add(rand.nextInt(54,76));
        }
        return studentHeight;
    }
    public static void sortHeight(ArrayList<Integer> studentHeight){
        ArrayList <Integer> sortedHeight1 = classHeight(studentHeight);
        ArrayList <Integer> sortedHeight2 = classHeight(studentHeight);

        Collections.sort(sortedHeight1);
        Collections.sort(sortedHeight2);
        for(int i = 0; i < sortedHeight1.size() + sortedHeight2.size(); i++){
            if(sortedHeight1.get(i) > sortedHeight2.get(i) && sortedHeight1 != null){
                System.out.println("Student in classroom 1 is taller than student in classroom 2: \nClassroom 1:" +sortedHeight1.get(i)+"\nClassroom 2:" + sortedHeight2.get(i));
            }else if(sortedHeight1.get(i) == null || sortedHeight2.get(i)== null){
                System.out.println("Student is not able to be compared");
            }else{
                System.out.println("Student in classroom 2 is taller than student in classroom 1.\nClassroom 1:" + sortedHeight1 + "\nClassroom 2:" + sortedHeight2.get(i));
            }
        }
        
    }
}