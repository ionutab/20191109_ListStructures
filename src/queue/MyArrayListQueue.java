package queue;

public class MyArrayListQueue {

    public static final int SEGMENT_SIZE = 8;

    int[] values = new int[SEGMENT_SIZE];
    int size = 0;
    // it's pointless to have this as well since size is always top
    // Integer top = null;

    public void push(int value) {
        if (size == this.values.length) {
            resizeUp();
        }
        this.values[size] = value;
        this.size++;
    }

    public Integer peek() {
        if (size == 0) {
            return null;
        } else {
            return this.values[0];
        }
    }

    public Integer pop() {
        if (size == 0) {
            return null;
        } else {

            int n = this.values[0];
            for (int i = 0; i < size - 1; i++) {
                this.values[i] = this.values[i + 1];
            }
            size--;
            return n;
        }
    }

    public void resizeUp() {
        int[] temp = new int[this.values.length + SEGMENT_SIZE];
        for (int i = 0; i < this.values.length; i++) {
            temp[i] = values[i];
        }
        this.values = temp;
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }
}
