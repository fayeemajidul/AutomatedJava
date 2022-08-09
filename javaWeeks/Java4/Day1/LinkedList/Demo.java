package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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
        ListIterator <String> strListIterator = linkedList.listIterator();
        while(strListIterator.hasNext()){
            //Goes to next entry and compares to new city.
            //if number = 0; then its the same.
            //Compareto function compares based of alphabet.
            int comparison = strListIterator.next().compareTo(newCity);
            if(comparison == 0){
                //DO NOT ADD ! Entry was already placed.
                System.out.println(newCity + "is already included as a destination");
                return false;
            }else if(comparison > 0 ){
                strListIterator.previous();
                strListIterator.add(newCity);
                return true;
            }else if(comparison < 0){
                //move on to next city
            }
            strListIterator.add(newCity);
        }
        return false;
    }
    public static void main(String[] args) {
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
        LinkedList <String> linkedList = new LinkedList<String>();

    }
    //Need an order of Alphabetic:
}
