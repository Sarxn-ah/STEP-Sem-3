package week8assignment;

import java.util.Scanner;

abstract class Room {
    abstract double calculateBill(int units, int occupants);
}

class SingleRoom extends Room {
    double calculateBill(int units, int occupants) {
        return units * 8;
    }
}

class SharedRoom extends Room {
    double calculateBill(int units, int occupants) {
        return (units * 6) / occupants;
    }
}

class AcRoom extends Room {
    double calculateBill(int units, int occupants) {
        return units * 10 + 200;
    }
}

public class Problem3_HostelElectricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double bill;

            if (type.equals("SINGLE")) {
                int units = sc.nextInt();
                Room room = new SingleRoom();
                bill = room.calculateBill(units, 1);
            } else if (type.equals("SHARED")) {
                int units = sc.nextInt();
                int occupants = sc.nextInt();
                Room room = new SharedRoom();
                bill = room.calculateBill(units, occupants);
            } else {
                int units = sc.nextInt();
                Room room = new AcRoom();
                bill = room.calculateBill(units, 1);
            }

            System.out.printf("%s: %.2f%n", type, bill);
            total += bill;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}