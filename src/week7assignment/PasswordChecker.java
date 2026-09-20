package week7assignment;

public class PasswordChecker {
    private final String password;

    public PasswordChecker(String password) {
        if (password == null) {
            throw new IllegalArgumentException("Password cannot be null.");
        }
        this.password = password;
    }

    public String getStrength() {
        int len = password.length();
        if (len < 6) {
            return "Weak";
        }
        if (len <= 9) {
            return "Medium";
        }
        return "Strong";
    }

    public static void main(String[] args) {
        PasswordChecker pc = new PasswordChecker("abcd");
        System.out.println(pc.getStrength());
        PasswordChecker pc2 = new PasswordChecker("abcdefgh");
        System.out.println(pc2.getStrength());
        PasswordChecker pc3 = new PasswordChecker("abcdefghij");
        System.out.println(pc3.getStrength());
    }
}
