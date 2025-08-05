class MiddleofLL{
  public class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

  public Node head;
  public Node tail;

  
  public Node middleele(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return null;
        }

        Node slow = head,fast = head;

        while(slow != null && fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
  public void addlast(int val){
        Node newnode = new Node(val);
        if(head == null){
            head = tail = newnode;
            return;
        }

        tail.next = newnode;
        tail = newnode;
  }
  
  public static void main(String[] args) {
        Linkedl ll = new Linkedl();

        ll.addlast(1);
        ll.addlast(2);
        ll.addlast(3);
        ll.addlast(4);
        ll.addlast(5);
        //ll.addlast(6);

        System.out.println(ll.middleele().val);
    }
  
}
