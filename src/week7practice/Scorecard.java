package week7practice;

public class Scorecard {
    private final boolean[] results;
    private final int totalQuestions;
    private int answeredCount;

    public Scorecard(int totalQuestions) {
        if (totalQuestions <= 0) {
            throw new IllegalArgumentException("Total questions must be positive.");
        }
        this.totalQuestions = totalQuestions;
        this.results = new boolean[totalQuestions];
        this.answeredCount = 0;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public int getAnsweredCount() {
        return answeredCount;
    }

    public void recordAnswer(boolean correct) {
        if (answeredCount >= totalQuestions) {
            System.out.println("Rejected: all " + totalQuestions + " answers already recorded.");
            return;
        }
        results[answeredCount] = correct;
        answeredCount++;
    }

    public int getScore() {
        int score = 0;
        for (int i = 0; i < answeredCount; i++) {
            if (results[i]) {
                score++;
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);
        System.out.println("Score = " + sc.getScore());
        sc.recordAnswer(true);
        System.out.println("Score after extra record = " + sc.getScore());
    }
}
