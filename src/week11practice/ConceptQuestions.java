package week11practice;

public class ConceptQuestions {

    public static void main(String[] args) {
        System.out.println("Question 1");
        System.out.println("Primitive data structures store a single value directly and are built into the language, "
                + "such as an int, a char, or a boolean. Non-primitive data structures are composed from primitive "
                + "types and other objects to store a collection of values with structure, such as a queue of "
                + "print jobs or a tree of folder entries. Primitive examples: double, short. Non-primitive "
                + "examples: a stack of browser history, a graph of city roads.");
        System.out.println();

        System.out.println("Question 2");
        System.out.println("Linearity describes how elements relate logically, not how they sit in memory. A linked "
                + "list still arranges its elements in a single sequence where each element has one predecessor and "
                + "one successor, so it is linear. Non-contiguous storage is an implementation detail of memory "
                + "layout; it does not introduce branching or hierarchy, so the reasoning is incorrect.");
        System.out.println();

        System.out.println("Question 3");
        System.out.println("Two independent loops run one after the other, so their costs add: O(m) + O(n) = O(m + n). "
                + "When a loop over m is nested inside a loop over n, the inner work repeats n times, so the costs "
                + "multiply: O(m) x n = O(m x n). The rule is that sequential steps add while nested steps multiply.");
        System.out.println();

        System.out.println("Question 4");
        System.out.println("A phone contacts app that is searched constantly but edited rarely can precompute a hash "
                + "map from name to contact record. This trades additional memory for the lookup structure in "
                + "exchange for reducing each search from O(n) linear scanning to O(1) average time.");
        System.out.println();

        System.out.println("Question 5");
        System.out.println("A hash map is preferred when lookups and inserts dominate: average O(1) access, search, "
                + "insert, and delete, at the cost of extra memory and no ordering. A sorted array is preferred when "
                + "ordered range queries dominate: O(log n) search, but O(n) insert and delete to shift elements. "
                + "Choose the hash map for frequent point lookups and the sorted array for frequent ordered scans.");
    }
}
