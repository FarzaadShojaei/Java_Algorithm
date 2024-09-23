public class LinkedList {
    class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
        }

    }
    private Node head;
    private Node tail;
    private int length;


    public LinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        length=1;
    }
    public void printList(){
        Node temp= head;
        while(temp != null){
            System.out.println(temp.value);
            temp=temp.next;
        }
    }

    public void getLength(){
        System.out.println("Length"+ length);
    }
    public void getTail(){
        System.out.println("Tail"+ tail.value);
    }
    public void getHead(){
        System.out.println("Head" + head.value);
    }

    public void append(int value){}
    public void prepend(int value){}

    public boolean insert(int index,int value){
        return false;
    }




}
