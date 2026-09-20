package week7practice;

public class Locker {
    private String combination;
    private final int lockerNumber;

    public Locker(int lockerNumber, String initialCode) {
        this.lockerNumber = lockerNumber;
        this.combination = initialCode;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public boolean changeCode(String currentCode, String newCode) {
        if (currentCode == null || !currentCode.equals(combination)) {
            System.out.println("Change rejected: wrong current code.");
            return false;
        }
        combination = newCode;
        System.out.println("Code changed successfully.");
        return true;
    }

    private boolean verifyCode(String code) {
        return code != null && code.equals(combination);
    }

    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");
        System.out.println("Locker number: " + l.getLockerNumber());
        l.changeCode("1234", "5678");
        System.out.println("Verify new code works (internal): " + l.verifyCode("5678"));
        l.changeCode("0000", "9999");
        System.out.println("Still new code after rejected change (internal): " + l.verifyCode("5678"));
    }
}
