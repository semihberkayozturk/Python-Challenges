 public class QueueLinked<Item> implements Iterable<Item>
  {
     private Node first; // link to least recently added node
     private Node last;  // link to most recently added node
     private int N;      // number of items on the queue

     private class Node {  
         Item item;
         Node next; 
      }

     public boolean isEmpty() {  return N == 0;  }
     public int size()        {  return N;  }

     public void enqueue(Item item)
     {  // Add item to the end of the list.
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if (isEmpty()) first = last;
        else           oldlast.next = last;
        N++;
     }

     public Item dequeue()
     {  // Remove item from the beginning of the list.
        Item item = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        N--;
        return item;
     }
}
