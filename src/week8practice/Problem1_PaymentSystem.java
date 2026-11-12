package week8practice;

import java.util.Scanner;

abstract class Payment {
    abstract double calculateAdjustedAmount(double amount);
}

class CardPayment extends Payment {
    double calculateAdjustedAmount(double amount) {
        return amount * 1.02;
    }
}

class WalletPayment extends Payment {
    double calculateAdjustedAmount(double amount) {
        return amount * 1.01;
    }
}

class BankTransferPayment extends Payment {
    double calculateAdjustedAmount(double amount) {
        return amount;
    }
}

public class Problem1_PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();
            Payment payment;

            if (type.equals("CARD")) {
                payment = new CardPayment();
            } else if (type.equals("WALLET")) {
                payment = new WalletPayment();
            } else {
                payment = new BankTransferPayment();
            }

            double adjustedAmount = payment.calculateAdjustedAmount(amount);
            System.out.printf("%s: %.2f%n", type, adjustedAmount);
            total += adjustedAmount;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}