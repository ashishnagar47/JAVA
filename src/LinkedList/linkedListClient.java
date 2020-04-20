package LinkedList;

public class linkedListClient {
    public static void main(String[] args) {
        linkedList link1=new linkedList();
        linkedList link2=new linkedList();
        link1.insertFirst(1);
        link1.insertFirst(3);
        link1.insertLast(4);
        link1.insertLast(7);
        link1.insertLast(6);
        link1.insertLast(9);
       // link1.insertLast(14);
        //link2=link2.mergesort(link1);
       // linkedList link=new linkedList();
       // link=link.mergeSort(link1,link2);
        //link.insertLast(4);
        //link.deletefirst();
        //link.deletelast();
       // link.insertinBtw(1,6);
      //  link.insertinBtw(2,8);
        //link.deletebetween(2);
       // System.out.println(link.valueAt(3));
       // link.shift(1);
        //link1.eliminateDuplicate();
        //link.reverse();
     //   link1.Kreverse(3);
        //System.out.println(link1.midValue());
        //System.out.println(link1.kthFromlast(3));
        //link1.size();
        link1.Reverse();
        link1.display();

    }
}
