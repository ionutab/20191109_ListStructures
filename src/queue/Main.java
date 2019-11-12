package queue;

public class Main {

    public static void main(String[] args) {
        MyArrayListQueue queue = new MyArrayListQueue();
        queue.push(7);
        queue.push(1);
        queue.push(2);
        queue.push(8);
        queue.push(9);
        queue.push(3);
        queue.push(5);
        queue.show();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.show();
        queue.push(29);
        queue.push(30);
        queue.push(31);
        queue.show();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.show();
    }

}
