public class Node extends ListItem{
    //Instance Field:
    public Node(Value value){
        super(values);
    }

    @Override
    protected void next() {
        
        
    }

    @Override
    protected void setNext() {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void previous() {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void setPrevious() {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected void compareTo() {
        // TODO Auto-generated method stub
        
    }

    @Override
    protected Value getValue() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    protected Value setValue() {
        // TODO Auto-generated method stub
        return null;
    }
    
}




//         -  next(), takes no parameters and returns the ListItem to its right.

//         -  setNext(), takes a ListItem and sets it as its rightLink, then it returns rightLink.

//         -  previous(), takes no parameters and returns the ListItem to its left.

//         -  setPrevious(), takes a ListItem and sets it as its leftLink, then it returns leftLink.

//         -  compareTo(), takes a ListItem and compares it to the ListItem that called this method. Use value from ListItem for comparison. If this value is greater than the value that was passed in, then it should return a number greater than zero. If vice versa, then it should return a number less than zero, and zero if equal.