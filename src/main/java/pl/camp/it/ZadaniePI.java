package pl.camp.it;

import java.util.Random;

public class ZadaniePI {
    public static void main(String[] args) {
        int pointsCount = 2000000000;
        Random random = new Random();
        int pointsInCircle = 0;

        for(int i = 0; i < pointsCount; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();

            double distanceFromCenter = Math.sqrt((x*x) + (y*y));

            if(distanceFromCenter < 1) {
                pointsInCircle++;
            }
        }

        double PI = (4.0 * (double) pointsInCircle) / (double) pointsCount;
        System.out.println(PI);
    }
}
