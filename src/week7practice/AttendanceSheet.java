package week7practice;

public class AttendanceSheet {
    private final String[] presentStudents;
    private final int capacity;
    private int count;

    public AttendanceSheet(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("Max size must be positive.");
        }
        this.capacity = maxSize;
        this.presentStudents = new String[maxSize];
        this.count = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void markPresent(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Rejected: invalid name.");
            return;
        }
        if (isPresent(name)) {
            System.out.println(name + " already marked present.");
            return;
        }
        if (count >= capacity) {
            System.out.println("Rejected: attendance sheet is full.");
            return;
        }
        presentStudents[count] = name;
        count++;
    }

    public int getPresentCount() {
        return count;
    }

    public boolean isPresent(String name) {
        for (int i = 0; i < count; i++) {
            if (presentStudents[i].equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);
        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");
        System.out.println("Present count = " + sheet.getPresentCount());
        System.out.println("isPresent(Ben) = " + sheet.isPresent("Ben"));
        System.out.println("isPresent(Chen) = " + sheet.isPresent("Chen"));
    }
}
