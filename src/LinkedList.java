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
        tail=newNode;
        length=1;
    }
    public void printList(){
        Node temp= head;

        while(temp != null){
            System.out.println(temp.value);
            temp=temp.next;
        }

    }

    public Node get(int index){
        if(index <0 || index >= length){
            return null;
        }
        Node temp=head;
        for(int i=0; i< index; i++){
            temp=temp.next;
        }
        return temp;
    }

    public Node removeLast(){
       if (length == 0) return null;
       Node temp=head;
       Node pre=head;
       while(temp.next != null){
           pre=temp;
           temp= temp.next;
       }
        tail=pre;
        tail.next=null;
        length--;
        if(length ==0){
            head =null;
            tail=null;
        }
        return temp;
    }

    public Node removeFirst(){
        if (length ==0) return null;
        Node temp=head;
        head=head.next;
        temp.next=null;
        length--;
        if(length == 0){
            tail=null;
        }


        return temp;

    }
    public void append(int value){
        Node newNode=new Node(value);
        if(length == 0){
            head=newNode;
            tail=newNode;
        } else {
            tail.next=newNode;
            tail=newNode;
        }
        length++;


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


    public void prepend(int value){
        Node newNode= new Node(value);
        if(length == 0){
            head=newNode;
            tail=newNode;
        } else{
            newNode.next=head;
            head=newNode;
        }
        length++;
    }

    public boolean insert(int index,int value){
        return false;
    }




}
