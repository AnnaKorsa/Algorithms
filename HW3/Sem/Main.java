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
    }
}
