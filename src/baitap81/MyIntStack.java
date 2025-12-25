package baitap81;

public class MyIntStack {
    private int[] contents;
    private int tos;

    public MyIntStack(int capacity) {
        contents = new int[capacity];
        tos = -1;
    }

    public boolean pushWithCheck(int element) {
        if (isFull()) {
            return false;
        }
        contents[++tos] = element;
        return true;
    }

    public void push(int element) {
        if (isFull()) {
            int newCapacity = contents.length * 2;
            int[] newContents = new int[newCapacity];
            System.arraycopy(contents, 0, newContents, 0, contents.length);
            contents = newContents;
        }
        contents[++tos] = element;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return contents[tos--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty!");
        }
        return contents[tos];
    }

    public boolean isEmpty() {
        return tos < 0;
    }

    public boolean isFull() {
        return tos == contents.length - 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Stack: [");
        for (int i = 0; i <= tos; i++) {
            sb.append(contents[i]).append(i == tos ? "" : ", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
