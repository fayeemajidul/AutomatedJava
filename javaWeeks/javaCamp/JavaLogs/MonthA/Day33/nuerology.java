abstract class brain{
    static int neurons = 1000000;
    static int synapse = 1000300;

    public int getNeurons() {
        return neurons;
    }
    public int getSynapse() {
        return synapse;
    }
}

public class nuerology extends brain{
    public static void main(String[] args){
        System.out.println("Total number of Neurons present with connections = " + (neurons + synapse));
    }
}