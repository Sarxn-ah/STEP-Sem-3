package week8assignment;

import java.util.Scanner;

abstract class Vehicle {
    abstract double calculateCharge(int hours);
}

class Bike extends Vehicle {
    double calculateCharge(int hours) {
        return 10 * hours;
    }
}

class Car extends Vehicle {
    double calculateCharge(int hours) {
        double charge = 30 + 20 * (hours - 1);
        return charge;
    }
}

class Truck extends Vehicle {
    double calculateCharge(int hours) {
        double charge = 50 * hours;
        if (charge < 100) {
            charge = 100;
        }
        return charge;
    }
}

public class Problem2_CampusParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int hours = sc.nextInt();
            Vehicle vehicle;

            if (type.equals("BIKE")) {
                vehicle = new Bike();
            } else if (type.equals("CAR")) {
                vehicle = new Car();
            } else {
                vehicle = new Truck();
            }

            double charge = vehicle.calculateCharge(hours);
            System.out.printf("%s: %.2f%n", type, charge);
            total += charge;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}