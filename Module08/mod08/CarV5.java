package Module08.mod08;

import java.io.PrintWriter;

public class CarV5 {

        private String carType;
        private int endMiles;
        private int startMiles;
        private double gallonsUsed;
        private double pricePerGallon;
        private double costOfTrip;
        private double milesPerGallon;
        private double gallonsPerMile;

    public CarV5(String type, int endMi, int startMi, double galUsed, double pricePerGal, double costOfGals, double milesPerGal, double galsPerMile )
    {
        carType = type;
        endMiles = endMi;
        startMiles = startMi;
        gallonsUsed = galUsed;
        pricePerGallon = pricePerGal;
        costOfTrip = costOfGals;
        milesPerGallon = milesPerGal;
        gallonsPerMile = galsPerMile;
    }

    public int calcDistance()
    {
        return endMiles - startMiles;
    }

    public double calcMPG()
    {
        return ((double)calcDistance()) / gallonsUsed;
    }

    public double calcGPM()
    {
        return ((double)gallonsUsed)/calcDistance();
    }

    public double calcCost()
    {
        double cost = (gallonsUsed * pricePerGallon);
        return cost;
    }

    public static void main (String[] args) {
        
        double gals;
        int sMiles;
        int eMiles;
        int distance;
        double mpg;
        String car;
        double price;
        double cost;
        
        gals = 10.4;
        sMiles = 107603;
        eMiles = 107706;
        price = 3.05;

        car = "2000 BMW 328i";
        
        CarV5 car1 = new CarV5(car, eMiles, sMiles, gals, price, gals *price, ((eMiles - sMiles)/gals), gals/price);
        
        cost = car1.calcCost();
        
        distance = car1.calcDistance();
        mpg = car1.calcMPG();
        
        System.out.println("                             Gas Mileage Calculations                     ");
        System.out.println("      Type of Car         Start Miles   End Miles   Distance   Gallons   Price   Cost   Miles/Gal   Gal/Mile");
        System.out.println("===========================================================================================================");
        System.out.printf("%3s %10d %11d %11d %11.1f %7.1f %8.1f %8.1f %10.2f\n", car1.carType, car1.startMiles, car1.endMiles, car1.calcDistance(), car1.gallonsUsed, car1.pricePerGallon,  car1.calcCost(), car1.calcMPG(), car1.calcGPM());

    }
}