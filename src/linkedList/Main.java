package linkedList;

public class Main {

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(5);
        myLinkedList.add(7);
        myLinkedList.add(11);
        myLinkedList.add(3);
        myLinkedList.add(9);
        myLinkedList.add(8);
        myLinkedList.add(4);
        myLinkedList.show();

        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList1.add(7);
        myLinkedList1.add(14);
        myLinkedList1.add(13);
        myLinkedList1.add(4);
        myLinkedList1.add(3);
        myLinkedList1.show();

        myLinkedList.add(33);
        myLinkedList.show();

    }
}
