import java.util.Random;

public class RealEstatePortfolio {
    private int numOfProperties;
    public RealEstatePortfolio(int numOfProperties){
        this.numOfProperties = numOfProperties;
    }

    public int getNumOfProperties() {
        return numOfProperties;
    }
    public void setNumOfProperties(int numOfProperties) {
        this.numOfProperties = numOfProperties;
    }

    private int getValuePerHouse(){
        Random rand = new Random();
        int pricePerHouse = rand.nextInt(50000, 650000);
        return pricePerHouse;
    }

    public int RealEstateNet (){
        int portfolio = getValuePerHouse();
        return portfolio;
    }
}
