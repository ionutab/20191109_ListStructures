package array;

public class MyArrayList {

    public static final int SEGMENT_SIZE = 8;

    public int[] values;
    public int size;

    MyArrayList() {
        this.values = new int[SEGMENT_SIZE];
        this.size = 0;
    }

    public void add(int value) {
        if (size == this.values.length) {
            resizeUp();
        }
        this.values[size] = value;
        this.size++;
    }

    public void showProperties() {
        System.out.println("capacity: " + this.values.length);
        System.out.println("size: " + size);
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

    public void resizeUp() {
        int[] temp = new int[this.values.length + SEGMENT_SIZE];
        for (int i = 0; i < this.values.length; i++) {
            temp[i] = values[i];
        }
        this.values = temp;
    }

    public int getAt(int index) {
        return this.values[index];
    }

    public void setAt(int index, int value) {
        if (index < size) {
            this.values[index] = value;
        }
    }

    public void removeAt(int index) {
        //TODO: homework
    }

    public void resizeDown(){
        //TODO: homework
    }
}
