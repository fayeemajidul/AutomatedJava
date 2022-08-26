public class Calculator {
    //Instance Fields:
    Floor floor = new Floor();
    Carpet carpet = new Carpet();

    //Constructor Method:
    public Calculator(Floor floor, Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }
    public double getTotalCost(){
        return (floor.getArea())*(carpet.cost);
    }

}
