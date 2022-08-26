public class Main{
    //Instance Field:
    //Constructor Class:
    public Main(){}
    public static void main(String[] args){
        //Masjid Program, calls masjid: 
        Pray pray = new Pray(2);
        Read read = new Read(55);
        System.out.println(read.arabicLiteracy);
        People alifPeople = new People(pray, true, read);
        alifPeople.Namaz();
    }
}