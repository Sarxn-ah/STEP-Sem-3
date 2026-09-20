package week7practice;

public final class NameTag {
    private final String firstName;
    private final String lastName;

    public NameTag(String fullName) {
        if (fullName == null) {
            throw new IllegalArgumentException("Full name cannot be null.");
        }
        String trimmed = fullName.trim();
        String[] parts = trimmed.split(" ");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Full name must have exactly first and last name separated by a single space.");
        }
        this.firstName = parts[0];
        this.lastName = parts[1];
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getNickname() {
        return firstName + " " + lastName.charAt(0) + ".";
    }

    public static void main(String[] args) {
        NameTag tag = new NameTag("Maria Gomez");
        System.out.println(tag.getNickname());
        NameTag tag2 = new NameTag("Maria Gomez");
        System.out.println(tag2.getNickname());
        System.out.println("Same nickname? " + tag.getNickname().equals(tag2.getNickname()));
    }
}
