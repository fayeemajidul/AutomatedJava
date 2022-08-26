public class Pray {
    int Surahs;
    //Instance Field:
    public Pray(int surahs){
        this.Surahs = surahs;
    }
    public Pray(){
        System.out.println("Default");
    }
    public int getSurahs(){
        return Surahs;
    }
    public void reciteSurahs(){
        for(int i = 0; i < Surahs; i++){
            System.out.println("Surah Fatiha # " + i);
        }
    }
}
