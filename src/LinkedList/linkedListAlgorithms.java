package LinkedList;

public class linkedListAlgorithms {
    private Node head;
    private Node tail;
    private  int size;

    public class Node{
        Node next;
        int value;
        Node(int value){this.value=value;}
    }
    /*
        INSERTION ALGORITHMS
    */
    public void insertFirst(int value){
        Node node=new Node(value);
        Node temp=head;
        head=node;
        head.next=temp;
        if(tail==null){
            tail=head;
        }
        size++;
    }

    public void insertLast(int value){
        Node node=new Node(value);
        if(tail==null){
            insertFirst(value);
        }
        tail.next=node;
        tail=node;
        size++;
    }

    public void insertInBetween(int value,int index){
        Node node =new Node(value);
        Node temp=head;
        int i=0;
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        Node t=temp.next;
        temp.next=node;
        node.next=t;
        size++;
    }

    public void display(){
        Node temp=head;
        while(temp!=tail){
            System.out.print(temp.value+"===>");
            temp=temp.next;
        }
        System.out.print(temp.value);
    }

    /*
        DELETION ALGORITHMS
     */

    public int deleteFirst(){
        if(head==null){
            System.out.print("Linked List is Empty");
        }
        int value=head.value;
        head=head.next;
        size--;
        return value;
    }

    public int deleteLast() {
        if (size < 2) {
            deleteFirst();
        }
        Node temp = head;
        if (size == 0) {
            System.out.println("Empty");
        }
        while (temp.next != tail) {
            temp = temp.next;
        }
        int value = temp.next.value;
        temp.next = null;
        size--;
        return value;
    }

    public int deletebetween(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node temp = get(index - 1);
        int value = temp.next.value;
        temp.next = temp.next.next;
        size--;
        return value;
    }

    public Node get(int index) {
        Node temp = head;
        if (size == 0) {
            System.out.println("Empty");
        }
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    /*
        MERGE SORT ALGO
    */
    public Node midValue(){
        Node temp=head;
        Node temp2=head;
        while(temp2!=null && temp2.next!=null){
            temp=temp.next;
            temp2=temp2.next.next;
        }
        return temp;
    }

    public linkedListAlgorithms mergeSort(linkedListAlgorithms l){
        linkedListAlgorithms First=new linkedListAlgorithms();
        First.head=l.head;
        Node mid=l.midValue();
        First.tail=mid;

        linkedListAlgorithms Second=new linkedListAlgorithms();
        Second.head=mid.next;
        Second.tail=l.tail;
        First.tail.next=null;
        First=mergeSort(First);
        Second=mergeSort(Second);
        return mergesort(First,Second);
    }

    public linkedListAlgorithms mergesort(linkedListAlgorithms L1,linkedListAlgorithms L2){
        linkedListAlgorithms list = new linkedListAlgorithms();
        Node First = L1.head;
        Node Second = L2.head;
        while (First != null && Second != null) {
            if (First.value < Second.value) {
                list.insertLast(First.value);
                First = First.next;
            } else {
                list.insertLast(Second.value);
                Second = Second.next;
            }
        }
        while (First != null) {
            list.insertLast(First.value);
            First = First.next;
        }
        while (Second != null) {
            list.insertLast(Second.value);
            Second = Second.next;
        }
        return list;
    }


    public static void main(String[] args) {
        linkedListAlgorithms l=new linkedListAlgorithms();
        linkedListAlgorithms l2=new linkedListAlgorithms();
        l.insertFirst(1);
        l.insertLast(5);
        l.insertLast(4);
        l.insertInBetween(2,1);
        //l.display();
//        System.out.println(l.deleteFirst());
//        System.out.println(l.deleteFirst());
//        System.out.println(l.deleteFirst());
//        System.out.println(l.deleteFirst());
        l2=l2.mergeSort(l);
        l2.display();
    }


}
