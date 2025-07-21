class LL{
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addfirst(int val){
        Node newnode = new Node(val);

        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next =head;
        head = newnode;
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

    public void addanywhere(int ind,int val){
        Node newnode = new Node(val);

        if(ind == 0){
            addfirst(val);
            return;
        }
        int i = 0;
        Node temp = head;
        while(i < ind-1){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void printele(){
        Node temp = head;

        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }

        while(temp != null){
            System.out.print(temp.val+"->");
            temp = temp.next;
        }
        System.out.print("end");
        System.out.println();
    }

    public void delhead(){
        if(head == null){
            System.out.println("Linked list is Empty");
            return;
        }

        head = head.next;
    }

    public void deltail(){
        if(head == null){
            System.out.println("Linked list is Empty");
            return;
        }
        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
    }
    public void rev(){
        Node prev = null,cur = head;
        Node next;

        while(cur != null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head =prev;
    }
    public static void main(String[] args) {
        LL linkedlist = new LL();

        linkedlist.addlast(1);
        linkedlist.addlast(2);
        linkedlist.addlast(4);
        linkedlist.addlast(5);
        linkedlist.addanywhere(2, 3);

        linkedlist.printele();
        linkedlist.rev();

        linkedlist.printele();

    }
}
