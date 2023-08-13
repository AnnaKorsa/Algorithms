package HW3.Sem;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.addSorted("Hello");
        list.addSorted("GB");
        list.addSorted("geekBrains");
        list.addSorted("GeekBrains");
        list.addSorted("World");
        list.addSorted("hello");
        list.addSorted("11");
        list.addSorted("100");

        list.print();
        list.revert();
        list.print();

        LinkedList<Integer> list1 = new LinkedList<>();

        list1.addSorted(1);
        list1.addSorted(5);
        list1.addSorted(7);
        list1.addSorted(4);
        list1.addSorted(11);
        list1.addSorted(17);

        list1.print();
        list1.revert();
        list1.print();
    }
}
