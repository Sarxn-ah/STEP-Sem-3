package week8practice;

import java.util.Scanner;

public class Problem4_ExamGrader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        double totalScore = 0;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split("\"");
            String type = parts[0].trim();
            String correctAnswer = parts[2];
            String studentAnswer = parts[3];
            int points = Integer.parseInt(parts[4].trim());

            double score;

            if (type.equals("MCQ") || type.equals("TF")) {
                if (correctAnswer.equalsIgnoreCase(studentAnswer)) {
                    score = points;
                } else {
                    score = 0;
                }
            } else if (type.equals("ESSAY")) {
                String[] keywords = correctAnswer.split(",");
                int matchCount = 0;
                String studentLower = studentAnswer.toLowerCase();

                for (String keyword : keywords) {
                    String keywordLower = keyword.trim().toLowerCase();
                    if (studentLower.contains(keywordLower)) {
                        matchCount++;
                    }
                }

                if (matchCount >= 2) {
                    score = points * 0.75;
                } else if (matchCount == 1) {
                    score = points * 0.50;
                } else {
                    score = 0;
                }
            } else {
                score = 0;
            }

            System.out.printf("%s: %.2f%n", type, score);
            totalScore += score;
        }

        System.out.printf("Total Score: %.2f%n", totalScore);
        sc.close();
    }
}