import 顺序表.MyArray;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(123);
        list.add(123);
        list.add(123);
        list.add(123);
        System.out.println(list);
    }
    public static void main1(String[] args) {
        MyArray myArray=new MyArray();
        myArray.add(1);
        myArray.add(1);
        myArray.add(1);
        myArray.add(1);
        myArray.add(1);
        myArray.add(1);
        myArray.add(1);
        myArray.add(1);
        myArray.add(1);
        myArray.add(1);
        myArray.add(19);

        myArray.add(100,10);
        myArray.display();

    }
}
