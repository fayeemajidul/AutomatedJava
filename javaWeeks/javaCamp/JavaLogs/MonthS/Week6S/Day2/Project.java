public class Project {
    public static void main(String[] args){
        RealEstatePortfolio property = new RealEstatePortfolio(3);
        Business suitBusiness = new Business();
        NetworthPortfolio profile1 = new NetworthPortfolio("Fayeem", 21, property, suitBusiness);
        profile1.getPortfolio();

        RealEstatePortfolio property2 = new RealEstatePortfolio(4);
        Business suitBusiness2 = new Business();
        NetworthPortfolio profile2 = new NetworthPortfolio("Emma", 25, property2, suitBusiness2);
        profile2.getPortfolio();

        RealEstatePortfolio property3 = new RealEstatePortfolio(7);
        Business suitBusiness3 = new Business();
        NetworthPortfolio profile3 = new NetworthPortfolio("Sayeem", 27, property3, suitBusiness3);
        profile3.getPortfolio();
        
        int TotalIncome = profile1.getPortfolio() + profile2.getPortfolio() + profile3.getPortfolio();
        System.out.println("\nMooktadeer Family Yearly Income : " + TotalIncome);
    }
}
