class MiddleofLL{
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
