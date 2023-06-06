import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();

        stack.push(1);
        stack.push(2);
        stack.pop();
        for (int num : stack) {
            System.out.println(num);
        }

    }
}
