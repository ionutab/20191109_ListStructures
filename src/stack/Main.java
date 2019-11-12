package stack;

public class Main {

    public static void main(String[] args) {
        MyLinkedListStack stack = new MyLinkedListStack();
        stack.push(7);
        stack.push(1);
        stack.push(2);
        stack.push(8);
        stack.push(9);
        stack.push(3);
        stack.push(5);
        stack.show();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.show();
        stack.push(29);
        stack.push(30);
        stack.push(31);
        stack.show();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.show();

    }

}
