package week8assignment;

import java.util.Scanner;

abstract class Customer {
    abstract double calculateFinalAmount(double amount);
}

class Student extends Customer {
    double calculateFinalAmount(double amount) {
        return amount * 0.9;
    }
}

class Staff extends Customer {
    double calculateFinalAmount(double amount) {
        return amount * 0.95;
    }
}

class Guest extends Customer {
    double calculateFinalAmount(double amount) {
        return amount + 10;
    }
}

public class Problem1_CanteenBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();
            Customer customer;

            if (type.equals("STUDENT")) {
                customer = new Student();
            } else if (type.equals("STAFF")) {
                customer = new Staff();
            } else {
                customer = new Guest();
            }

            double finalAmount = customer.calculateFinalAmount(amount);
            System.out.printf("%s: %.2f%n", type, finalAmount);
            total += finalAmount;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}