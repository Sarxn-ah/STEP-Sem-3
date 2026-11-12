package week8assignment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

abstract class Subscription {
    abstract LocalDate getRenewalDate(String startDate);
}

class BasicPlan extends Subscription {
    LocalDate getRenewalDate(String startDate) {
        return LocalDate.parse(startDate).plusDays(30);
    }
}

class StandardPlan extends Subscription {
    LocalDate getRenewalDate(String startDate) {
        return LocalDate.parse(startDate).plusDays(90);
    }
}

class PremiumPlan extends Subscription {
    LocalDate getRenewalDate(String startDate) {
        return LocalDate.parse(startDate).plusDays(365);
    }
}

public class Problem5_StreamingRenewal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            String startDate = sc.next();
            Subscription subscription;

            if (type.equals("BASIC")) {
                subscription = new BasicPlan();
            } else if (type.equals("STANDARD")) {
                subscription = new StandardPlan();
            } else {
                subscription = new PremiumPlan();
            }

            LocalDate renewalDate = subscription.getRenewalDate(startDate);
            System.out.printf("%s: %s%n", name, renewalDate.format(formatter));
        }

        sc.close();
    }
}