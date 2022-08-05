import java.util.ArrayList;
import java.util.Arrays;

public class arrayP{
    //Instance Field:
    //Constructor Field:
    public static void arrayGathering(){
        ArrayList <String> names = new ArrayList<String>();
        names.add("Martin");
        names.add("Fayeem");
        names.add("Zairah");
        names.add("Alima");
        names.add("Yusuf");
        names.add("I appreciate you guys");

        names.remove(1);
        String myLovedOne = names.get(1);

        // for(int i = 0; i < names.size(); i++){
        //     names.set(i, myLovedOne);
        // }
        names.add("Even though I feel empty right now, I miss you guys. Just afraid to catch feelings again.");
        System.out.println((names));
    }
    public arrayP(){}
    public static void main(String[] args) {
        arrayGathering();
    }
}