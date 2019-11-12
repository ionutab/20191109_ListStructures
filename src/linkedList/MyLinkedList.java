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

    public void showReverse(Node n) {
        if (n.next != null) {
            showReverse(n.next);
        }
        System.out.print(n.value + " ");
    }

    public int getAt(int index) {
//        int step = 0;
//        Node n = start;
//        while (step < index) {
//            n = n.next;
//            step++;
//        }
        Node n = getNodeAt(index);
        return n.value;
    }

    public Node getNodeAt(int index) {
        int step = 0;
        Node n = start;
        while (step < index) {
            n = n.next;
            step++;
        }
        return n;
    }

    public void removeAt(int index) {
        if (index == 0) {
            start = start.next;
        } else {
            // the node before the node we have to remove
            Node n = getNodeAt(index - 1);
            Node nodeToDelete = n.next;
            if (nodeToDelete != null) {
                n.next = nodeToDelete.next;
            }
        }
    }

}
