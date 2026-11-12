package week8practice;

import java.util.Scanner;

abstract class Transport {
    abstract double calculateFare(double distance, double peakHourFactor);
}

class Bus extends Transport {
    double calculateFare(double distance, double peakHourFactor) {
        double fare = 2 + 0.10 * distance;
        if (fare > 10) {
            fare = 10;
        }
        return fare;
    }
}

class Train extends Transport {
    double calculateFare(double distance, double peakHourFactor) {
        return 3 + 0.15 * distance;
    }
}

class Metro extends Transport {
    double calculateFare(double distance, double peakHourFactor) {
        return (1.50 + 0.20 * distance) * peakHourFactor;
    }
}

public class Problem5_PublicTransportFare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double distance = sc.nextDouble();
            Transport transport;
            double peakHourFactor = 1.0;

            if (type.equals("METRO")) {
                peakHourFactor = sc.nextDouble();
                transport = new Metro();
            } else if (type.equals("BUS")) {
                transport = new Bus();
            } else {
                transport = new Train();
            }

            double fare = transport.calculateFare(distance, peakHourFactor);
            System.out.printf("%s: %.2f%n", type, fare);
            total += fare;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}