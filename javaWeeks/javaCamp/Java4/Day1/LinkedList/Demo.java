package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void printList(LinkedList <String> linkedList){
        //Iterators through the string.
        Iterator <String> i = linkedList.iterator();
        while(i.hasNext()){
            //Printing out current element and sets curent element to nex.
            
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("========================");
    }
    public static boolean addInOrder(LinkedList <String> linkedList, String newCity){
        //Linked List can go to previous element/ Future element.

        //////////////////////////////////////////////////////
        /////////////// Zairah I miss you ///////////////////
        ////////////////////////////////////////////////////
        //This line just creates a linkedList iterator it does not point to the first element in the list, until you use next.
        //////////////////////////////////////////////////////


        ListIterator <String> strListIterator = linkedList.listIterator();
        while(strListIterator.hasNext()){
            //Goes to next entry and compares to new city.
            //if number = 0; then its the same.
            //Compareto function compares based of alphabet.
            int comparison = strListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //DO NOT ADD ! Entry was already placed.
                System.out.println(newCity + " is already included as a destination");
                return false;
            }else if(comparison > 0 ){
                strListIterator.previous();
                strListIterator.add(newCity);
                return true;
            }else if(comparison < 0){
                //move on to next city
            }

        }
        strListIterator.add(newCity);
        return true;
    }
    public static void visit(LinkedList <String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = true;
        boolean goingForward = true;
        ListIterator <String> listIteratior = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the iternerary");
        } else {
            System.out.println("Now visiting " + listIteratior.next()); 
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                System.out.println("Holiday over");
                quit = true;

                case 1:
                if(!goingForward){
                    if(listIteratior.hasNext()){
                        listIteratior.next();
                    }
                    goingForward = true;
                }
                if(listIteratior.hasNext()){
                    System.out.println("Now visiting"  + listIteratior.next());
                }else{
                    System.out.println("You've reached the end of the list");
                    goingForward = false;
                }
                goingForward = false;
                break;

                case 2:
                    if(listIteratior.hasPrevious()){
                        listIteratior.previous();
                    }
                    if(listIteratior.hasPrevious()){
                        System.out.println("Now visiting" + listIteratior.previous());
                    }
                    else{
                        System.out.println("We are at the start of the list");
                        //only can go forward.
                        goingForward = true;
                    }
                    break;

                case 3:
                    printMenu();
                    break;
            }
        }
        scanner.close();

    }

    public static void printMenu(){
        System.out.println("Available Actions: 0 -- to quit, 1 -- go to next city, 2 --- go to previous city, 3 -- print menu options");
    }


    public static void main(String[] args) {
        LinkedList <String> linkedList = new LinkedList<String>();
        addInOrder(linkedList, "Sydney");
        addInOrder(linkedList, "Melbourne");
        addInOrder(linkedList, "Brisbane");
        addInOrder(linkedList, "Perth");
        addInOrder(linkedList, "Canberra");
        addInOrder(linkedList, "Adelaide");
        addInOrder(linkedList, "Darwin");
        addInOrder(linkedList, "Darwin");
        printList(linkedList);
        visit(linkedList);



        // LinkedList <String> placesToVisit = new LinkedList<String>();
        // placesToVisit.add("Sydney");
        // placesToVisit.add("Melbourne");
        // placesToVisit.add("Brisbane");
        // placesToVisit.add("Perth");
        // placesToVisit.add("Canberra");
        // placesToVisit.add("Adelaide");
        // placesToVisit.add("Darwin");
        // printList(placesToVisit);
        // placesToVisit.add(1, "Alice Springs");
        // printList(placesToVisit);

        //LinkedList with ListIterator:
    }
    //Need an order of Alphabetic:
}
