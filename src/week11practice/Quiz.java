package week11practice;

public class Quiz {

    private static void printQuestion(String number, String question, String[] options, String answer) {
        System.out.println(number + ". " + question);
        char label = 'A';
        for (String option : options) {
            System.out.println("   " + label + ". " + option);
            label++;
        }
        System.out.println("   Answer: " + answer);
        System.out.println();
    }

    public static void main(String[] args) {
        printQuestion("Q1", "What is the primary purpose of a data structure?",
                new String[]{
                        "To make a program faster regardless of data growth.",
                        "To define how data is organized, stored, and accessed efficiently for specific operations.",
                        "To determine the exact execution time of an algorithm on any machine.",
                        "To prevent any program from consuming too much memory."
                }, "B");

        printQuestion("Q2", "Which of the following describes a non-primitive data structure?",
                new String[]{
                        "Stores a single value, like an integer or a character.",
                        "Its memory layout is always fixed and determined by the language.",
                        "Is a basic, built-in type provided directly by a language.",
                        "Is built by combining primitive types and stores a collection of values."
                }, "D");

        printQuestion("Q3", "In a 1D array, what is the time complexity for accessing an element at a known index?",
                new String[]{"O(n)", "O(log n)", "O(1)", "O(n^2)"}, "C");

        printQuestion("Q4", "An algorithm processes an input of size n. If it contains a loop nested inside another loop, both iterating n times, what is the overall time complexity?",
                new String[]{"O(n)", "O(n + n)", "O(n^2)", "O(log n)"}, "C");

        printQuestion("Q5", "An algorithm has one loop that iterates m times over listA, followed by a second, independent loop that iterates n times over listB. What is the overall time complexity?",
                new String[]{"O(m x n)", "O(m + n)", "O(m^2)", "O(n^2)"}, "B");

        printQuestion("Q6", "Which of the following are examples of common operations performed on data structures? (Select all that apply.)",
                new String[]{"Deletion", "Debugging", "Traversal", "Updating", "Compilation"}, "A, C, D");

        printQuestion("Q7", "A financial system stores a large number of transaction records in an array that is sorted by date. Queries for specific date ranges are very frequent, but new transactions are added only at the end of the day. Which data structure characteristic is being prioritized by sorting the array?",
                new String[]{
                        "O(1) insertion at the end.",
                        "O(n) deletion at the start.",
                        "O(log n) search for date ranges.",
                        "O(n^2) traversal."
                }, "C");

        printQuestion("Q8", "Which data structure is typically best for scenarios requiring frequent searches and rare inserts/deletes, especially when the data needs to maintain an order?",
                new String[]{"Unsorted Array", "Linked List", "Hash-based structure", "Sorted Array"}, "D");

        printQuestion("Q9", "The Two-Pointer technique is most effective when working with arrays that are:",
                new String[]{
                        "Unsorted and require complex nested loops.",
                        "Non-linear and represent hierarchical data.",
                        "Sorted or have an exploitable ordering property, to avoid brute-force comparisons.",
                        "Subject to frequent random access insertions and deletions."
                }, "C");

        printQuestion("Q10", "What is the primary benefit of using the sliding window technique in array problems?",
                new String[]{
                        "It converts a linear data structure into a non-linear one.",
                        "It guarantees an O(1) space complexity for all problems.",
                        "It avoids redundant recomputation for overlapping subproblems, often reducing time complexity from O(n x k) or O(n^2) to O(n).",
                        "It only works effectively when the array is completely unsorted."
                }, "C");
    }
}
