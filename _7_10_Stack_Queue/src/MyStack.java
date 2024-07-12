import java.util.Arrays;

public class MyStack {
    public int[] elem;
    public int usedSize;

    public MyStack() {
        this.elem = new int[10];
    }
    public void display(){
        for(int i=0;i<this.usedSize;i++){
            System.out.print(elem[i]+ " ");
        }
        System.out.println();
    }



    public void push(int val) {
        if(isFull()) {
            this.elem = Arrays.copyOf(elem,2*elem.length);
        }
        elem[usedSize++] = val;
    }

    public boolean isFull() {
        return usedSize == elem.length;
    }

    public int pop() {
        if(isEmpty()){
            return 1;
        }
        return this.elem[--usedSize];
    }
    //获取栈顶元素 但是不删除
    public int peek() {
        if(isEmpty()){
            return -1;
        }
        return this.elem[usedSize];
    }

    public boolean isEmpty() {
//        if(usedSize == 0){
//            return true;
//        }
//        return false;
        return usedSize==0;
    }
}