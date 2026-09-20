package week7practice;

public class PiggyBank {
    private double savings;
    private final String id;

    public PiggyBank(String id) {
        this.id = id;
        this.savings = 0;
    }

    public String getId() {
        return id;
    }

    public double getSavings() {
        return savings;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit rejected: amount must be positive.");
            return;
        }
        savings += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected: amount must be positive.");
            return;
        }
        if (amount > savings) {
            System.out.println("Withdrawal rejected: insufficient savings. Savings stays " + savings);
            return;
        }
        savings -= amount;
    }

    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        System.out.println("Initial savings = " + pb.getSavings());
        pb.deposit(100);
        System.out.println("After deposit(100) -> savings = " + pb.getSavings());
        pb.withdraw(30);
        System.out.println("After withdraw(30) -> savings = " + pb.getSavings());
        pb.withdraw(500);
        System.out.println("After withdraw(500) -> savings = " + pb.getSavings());
    }
}
