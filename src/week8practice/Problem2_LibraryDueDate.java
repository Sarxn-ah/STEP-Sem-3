package week8practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

abstract class LibraryItem {
    abstract LocalDate getDueDate();
}

class Book extends LibraryItem {
    private final String title;
    private static final LocalDate CURRENT_DATE = LocalDate.of(2023, 10, 26);

    Book(String title) {
        this.title = title;
    }

    LocalDate getDueDate() {
        return CURRENT_DATE.plusDays(14);
    }

    String getTitle() {
        return title;
    }
}

class Dvd extends LibraryItem {
    private final String title;
    private static final LocalDate CURRENT_DATE = LocalDate.of(2023, 10, 26);

    Dvd(String title) {
        this.title = title;
    }

    LocalDate getDueDate() {
        return CURRENT_DATE.plusDays(7);
    }

    String getTitle() {
        return title;
    }
}

class Magazine extends LibraryItem {
    private final String title;
    private static final LocalDate CURRENT_DATE = LocalDate.of(2023, 10, 26);

    Magazine(String title) {
        this.title = title;
    }

    LocalDate getDueDate() {
        return CURRENT_DATE.plusDays(3);
    }

    String getTitle() {
        return title;
    }
}

public class Problem2_LibraryDueDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LibraryItem[] items = new LibraryItem[n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ", 2);
            String type = parts[0];
            String title = parts.length > 1 ? parts[1] : "";

            if (type.equals("BOOK")) {
                title = title.replaceAll("^\"|\"$", "").replaceAll("^\"|\"$", "");
                items[i] = new Book(title);
            } else if (type.equals("DVD")) {
                title = title.replaceAll("^\"|\"$", "").replaceAll("^\"|\"$", "");
                items[i] = new Dvd(title);
            } else if (type.equals("MAGAZINE")) {
                title = title.replaceAll("^\"|\"$", "").replaceAll("^\"|\"$", "");
                items[i] = new Magazine(title);
            }
        }

        for (LibraryItem item : items) {
            LocalDate dueDate = item.getDueDate();
            System.out.printf("%s: %s%n", item.getTitle(), dueDate.format(formatter));
        }

        sc.close();
    }
}