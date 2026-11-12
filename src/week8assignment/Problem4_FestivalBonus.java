package week8assignment;

import java.util.Scanner;

abstract class Employee {
    abstract double calculateBonus();
}

class FullTimeEmployee extends Employee {
    private final double salary;

    FullTimeEmployee(double salary) {
        this.salary = salary;
    }

    double calculateBonus() {
        return salary * 0.10;
    }
}

class PartTimeEmployee extends Employee {
    private final double salary;

    PartTimeEmployee(double salary) {
        this.salary = salary;
    }

    double calculateBonus() {
        return salary * 0.05;
    }
}

class Intern extends Employee {
    double calculateBonus() {
        return 2000;
    }
}

public class Problem4_FestivalBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();
            Employee employee;

            if (type.equals("FULLTIME")) {
                employee = new FullTimeEmployee(salary);
            } else if (type.equals("PARTTIME")) {
                employee = new PartTimeEmployee(salary);
            } else {
                employee = new Intern();
            }

            double bonus = employee.calculateBonus();
            System.out.printf("%s: %.2f%n", name, bonus);
            total += bonus;
        }

        System.out.printf("Total Bonus: %.2f%n", total);
        sc.close();
    }
}