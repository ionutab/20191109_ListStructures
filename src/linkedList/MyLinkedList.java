package linkedList;

public class MyLinkedList {

    Node start;

    public Node getEnd() {
        if (start == null) {
            return null;
        }
        Node n = start;
        while (n.next != null) {
            n = n.next;
        }
        return n;
    }

    public void add(int value) {
        // put the value in a node
        Node newNode = new Node(value);

        if (start == null) {
            start = newNode;
        } else {
            Node endNode = getEnd();
            endNode.next = newNode;
        }
    }

    public void show() {
        Node n = start;
        while (n != null) {
            System.out.print(n.value + " ");
            // move forward
            n = n.next;
        }
        System.out.println();
    }

}
