package baitap81;

public class TestMyIntStack {
    public static void main(String[] args) {
        MyIntStack stack = new MyIntStack(2);

        System.out.println("Pushing 10, 20...");
        stack.push(10);
        stack.push(20);
        System.out.println(stack);

        System.out.println("Pushing 30 (Triggering dynamic resize)...");
        stack.push(30);
        System.out.println(stack);

        System.out.println("Peek: " + stack.peek());
        System.out.println("Pop: " + stack.pop());
        System.out.println("After Pop: " + stack);
    }
}
