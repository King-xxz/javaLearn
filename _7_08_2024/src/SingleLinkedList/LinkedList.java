package SingleLinkedList;

import org.w3c.dom.Node;

public class LinkedList implements IList {

    static class NodeList {
        public int val;
        public NodeList next;

        public NodeList(int val) {
            this.val = val;
        }
    }
    public NodeList head;


    @Override
    public void addFirst(int data) {
        NodeList node=new NodeList(data);
        node.next=head;
        head=node;
    }

    @Override
    public void addLast(int data) {
        NodeList cur=head;
        NodeList node=new NodeList(data);
        if(head == null){
            return;
        }
        while(cur.next != null){
            cur=cur.next;
        }
        cur.next=node;


    }

    @Override
    public void addIndex(int index, int data) {

    }

    @Override
    public boolean contains(int key) {
        return false;
    }

    @Override
    public void remove(int key) {

    }

    @Override
    public void removeAllKey(int key) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    //遍历链表的值
    public void display() {
        NodeList cur=head;
        while(cur !=null){
            System.out.print(cur.val+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}