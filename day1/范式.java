package java数据结构.day1;

class MyArray<E> {
    public Object[] myArray=new Object[10];
    public void setVuale(int pos,E value){
        myArray[pos]=value;
    }
    public E getVuale(int pos){
        return (E)myArray[pos];
    }
}

public class 范式 {
    public static void main(String[] args) {
        MyArray<Integer> myArray1=new MyArray<>();
        myArray1.setVuale(1,10);
        Integer e=myArray1.getVuale(1);
        System.out.println(e);


    }
}
