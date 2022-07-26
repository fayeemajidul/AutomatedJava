public class PC {
    //Instance Fields:
    private Case theCase;
    private Monitor monitor;
    private Motherboad motherboard;

    //Constructor Method:
    public PC(Case theCase, Monitor monitor, Motherboad motherboad){
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboad;
    }
    //Has a relationship doesn't need to stem from the parent class.

    //Is-a-relationship Directly stems from the parent class.

    public Case getCase(){
        return theCase;
    }
    public Monitor getMonitor(){
        return monitor;
    }
    public Motherboad getMotherboad(){
        return motherboard;
    }
    
}
