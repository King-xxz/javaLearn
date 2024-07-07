package 顺序表;

import java.util.Arrays;

public class MyArray implements IList {
    public int[] array;
    public int usedSize;
    public static final int DEFAULT_SIZE=10;

    public MyArray(){
        this.array=new int[DEFAULT_SIZE];
        this.usedSize=0;
    }
    public int getUsedSize() {
        return usedSize;
    }



    @Override
    public void add(int data) {
        if(!isFull()){
            grow();
        }
        this.array[this.usedSize]=data;
        this.usedSize++;

    }

    private void grow(){
        this.array=Arrays.copyOf(this.array,this.usedSize*2);
    }

    @Override
    public boolean isFull() {
        if(array.length==usedSize){
            return false;
        }
        return true;
    }

    @Override
    public void add(int pos, int data) {
        if(checkPos(pos)){
            for (int i=this.usedSize;i>pos;i++){
                this.array[i]=this.array[i-1];
            }
            this.array[pos]=data;
            this.usedSize++;
        }
        else {
            System.out.println("输入的pos不合法");
        }
    }

    public Boolean checkPos(int pos){
        if(pos<0 || pos>this.usedSize){
            return false;
        }
        return true;
    }

    @Override
    public boolean contains(int toFind) {
        return false;
    }

    @Override
    public int indexOf(int toFind) {
        return 0;
    }

    @Override
    public int get(int pos) {
        return 0;
    }

    @Override
    public void set(int pos, int value) {

    }

    @Override
    public void remove(int toRemove) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public void display() {
        for (int i=0;i<this.usedSize;i++){
            System.out.print(this.array[i]+ " ");
        }
    }
}
