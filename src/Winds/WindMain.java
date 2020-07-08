package Winds;

import java.util.Scanner;

public class WindMain {

    private static final double BEAUFORT = 3.01;
    private static final double NAUTIC_MILE = 1.852;

    public static void main(String[] args) {
        Wind wind = buildWind();

        convertWindSpeedToNauticMiles(wind);
        kilometersPerHourToBeufortScale(wind);
        getWindStrenght(wind);
    }

    //Math.pow(windSpeed / BEAUFORT, 0.75);

    private static Wind buildWind(){
        Scanner inputScanner = new Scanner(System.in);
        double windSpeed = inputScanner.nextDouble();

        return new Wind(windSpeed);
    }
}
