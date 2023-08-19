package HW4.HashTable;

public class Main {
    public static void main(String[] args) {
        HashTable<String, Integer> table = new HashTable<>();

        table.add("A", 1);
        table.add("B", 2);
        table.add("V", 3);
        table.add("X", 4);
        table.add("S", 5);
        table.add("R", 6);
//        table.add("N", 7);
//        table.add("F", 8);

        table.print();
    }
}
