package array;

public class Main {

    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(4);
        myArrayList.add(5);
        myArrayList.add(8);
        myArrayList.add(9);
        myArrayList.add(12);
        myArrayList.add(11);
        myArrayList.add(3);
        myArrayList.add(7);
//        myArrayList.resizeUp();
        myArrayList.add(10);
        myArrayList.show();
        myArrayList.showProperties();
    }

}
