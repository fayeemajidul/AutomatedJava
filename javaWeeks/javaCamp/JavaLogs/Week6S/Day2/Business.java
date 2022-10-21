import java.util.Random;

public class Business implements IbusinessClass{

    private int randomGenerator(int bound1, int bound2){
        Random rand = new Random();
        return rand.nextInt(bound1, bound2);
    }

    @Override
    public int merchandiseCost() {
        return randomGenerator(350, 750);
    }

    @Override
    public int merchandiseSold() {
        return randomGenerator(130, 413);
    }

    @Override
    public int totalProfits() {
        int profits = merchandiseSold() * merchandiseCost();
        int grossLoss = (100) + employerLogistics();
 
        return (profits - grossLoss);
    }

    @Override
    public int employerLogistics() {
        int CostPerSaleEmployeeMonthly = randomGenerator(1000, 1450);
        int CostPerManagerMonthly = randomGenerator(200, 1000);
        int numOfEmployees = randomGenerator(3, 10);
        int numOfManagers = randomGenerator(1, 2);

        return (CostPerManagerMonthly * numOfManagers) + (CostPerSaleEmployeeMonthly * numOfEmployees);
    }

}
