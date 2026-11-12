package week8practice;

import java.util.Scanner;

abstract class Delivery {
    abstract double calculateFee(double weight, double distance, double customsFee);
}

class StandardDelivery extends Delivery {
    double calculateFee(double weight, double distance, double customsFee) {
        return 5 + 0.50 * weight + 0.10 * distance;
    }
}

class ExpressDelivery extends Delivery {
    double calculateFee(double weight, double distance, double customsFee) {
        return 15 + 1.00 * weight + 0.20 * distance;
    }
}

class InternationalDelivery extends Delivery {
    double calculateFee(double weight, double distance, double customsFee) {
        return 25 + 2.00 * weight + 0.50 * distance + customsFee;
    }
}

public class Problem3_DeliveryFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        double total = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String type = parts[0];
            double weight = Double.parseDouble(parts[1]);
            double distance = Double.parseDouble(parts[2]);
            Delivery delivery;

            if (type.equals("STANDARD")) {
                delivery = new StandardDelivery();
            } else if (type.equals("EXPRESS")) {
                delivery = new ExpressDelivery();
            } else {
                double customsFee = Double.parseDouble(parts[3]);
                delivery = new InternationalDelivery();
            }

            double fee;
            if (type.equals("INTERNATIONAL")) {
                double customsFee = Double.parseDouble(parts[3]);
                fee = delivery.calculateFee(weight, distance, customsFee);
            } else {
                fee = delivery.calculateFee(weight, distance, 0);
            }

            System.out.printf("%s: %.2f%n", type, fee);
            total += fee;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}