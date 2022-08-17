import java.util.List;
public abstract class ListItem {
    protected List rightLink = null;
    protected List leftLink = null;
    protected Object value;

    public ListItem(Object value){
        this.value = value;
    }
    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);
    abstract int compareTo(ListItem item);

    //Access Modifers + Mutation Methods:
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
}
