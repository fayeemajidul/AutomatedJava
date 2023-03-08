import java.util.Scanner;

public class Stoicism{
    public static void main(String[] args){
        int age = scannerPractice();   
        int year = yearToDate();
        System.out.println("Date of Birth is: " + (year - age));
         
    }
    public static int scannerPractice(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your age");
        int age =  scan.nextInt();
        return age;
    }
    public static int yearToDate(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the year");
        int year = scan.nextInt();
        return year;
    }
}