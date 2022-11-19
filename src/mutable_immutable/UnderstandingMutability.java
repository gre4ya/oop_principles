package mutable_immutable;

public class UnderstandingMutability {
    public static void main(String[] args) {
        String city = "Chicago"; // citi -> Stack, "Chicago" -> String pool in Heap

        city = "Miami"; // "Miami" -> String pool in Heap but "Chicago" stays in String pool(it doesn't go to the garbage)
    }
}
