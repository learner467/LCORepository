import java.util.Stack;

public class Stack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        stack.push("batman");
        stack.push("aquaman");
        stack.push("flash");
        System.out.println("My stack is: " + stack);
        stack.pop();
        System.out.println("My stack is: " + stack);
        System.out.println("My search object is at: " + stack.search("aquaman"));
    }
}
