public class ReverseLL{
      public void Rev(){
        if(head == null){
            System.out.println("Linked list is Empty");
            return;
        }

        //iterative reverse
        Node cur = head,prev = null,next;
        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }
  public void printele(){
        if(head == null){
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("end");
        System.out.println();
    }
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
        System.out.println(ll.printele());
        System.out.println(ll.rev());
        System.out.println(ll.printele());
    }
  
}
