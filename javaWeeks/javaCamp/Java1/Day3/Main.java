public class Main{
    public static void main(String[] args){
        //Object # 1: Area of Wall
        // Wall wall1 = new Wall(5, 4);
        // System.out.println("Area  = " +  wall1.getArea());

        // wall1.setHeight(-1.5);
        // System.out.println("Width= " + wall1.getWidth());
        // System.out.println("Height= " + wall1.getHeight());
        // System.out.println("Area= " + wall1.getArea());

        //Object #2: Cost Of Floor:
        Carpet carpet = new Carpet(3.5);
        Floor floor =  new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total = " + calculator.getTotalCost());
        carpet =  new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("Total = " + calculator.getTotalCost());
    }
}