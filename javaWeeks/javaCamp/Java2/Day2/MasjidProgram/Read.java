public class Read {
    //Instance Field:
    int arabicLiteracy;
    public Read(int arabicLiteracy){
        this.arabicLiteracy = arabicLiteracy;
    }
    
    public void canRead(){
        System.out.println(" You can read at a literacy rate of " + arabicLiteracy);
        if(arabicLiteracy < 45){
            getPractice();
        }
    }
    public void getPractice(){
        System.out.println("Now practicing how to read");
        System.out.println("Reciting Surah-Al-Fatiha");
    }
}
