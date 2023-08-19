package HW4.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.add(7);
        tree.add(5);
        tree.add(4);
        tree.add(11);
        tree.add(1);
        tree.add(3);
        tree.add(6);
        tree.add(9);

        tree.print();

    }
}
