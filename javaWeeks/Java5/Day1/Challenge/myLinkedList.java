import java.util.List;

public class myLinkedList implements NodeList {
    private ListItem root = null;
    public myLinkedList(ListItem root){
        //Object initalizes the Root w/ the constructor which then the line below sends to the ListItem.

        this.root = root;

    }
    @Override
    public ListItem getRoot() {
        //Getting the Starting position and equalling it to the Root.
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        //Needs to check if a list is empty first.
        if(this.root == null){
            //The list was empty, so this item = head.
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        //Looping through the List 
        while(currentItem != null){
            int comparison = currentItem.compareTo(newItem);
            if(comparison < 0){
                //move current item to the right bc new item is greater
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else{
                    //Reached the end of the list
                    //New Item (Previous) <---- CurrentItem (Next)
                    //Establishing Connections Nodes:
                    currentItem.setNext(newItem);
                    newItem.setPrevious(currentItem);
                    return true;
                }
            }

        }
        // if(currentItem.compareTo(newItem))
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        // TODO Auto-generated method stub
        
    }
    
}
