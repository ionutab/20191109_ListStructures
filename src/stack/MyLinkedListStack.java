package stack;

public class MyLinkedListStack {

    Node bottom;
    Node top;

    public void push(int value) {
        Node n = new Node(value);
        if (bottom == null) {
            bottom = n;
            top = n;
        } else {
            n.next = top;
            top = n;
        }
    }

    public Integer peek() {
        if (top != null) {
            return top.value;
        } else {
            return null;
        }
    }

    public Integer pop() {
        if (top == null) {
            return null;
        } else {
            int value = top.value;
            top = top.next;
            if (top == null) {
                bottom = null;
            }
            return value;
        }
    }

    public void show() {
        Node n = top;
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
        System.out.println();
    }


}
