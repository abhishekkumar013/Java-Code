public class dl {
    Node head;
    class Node{
        int data;
        Node next;
        Node prev; 

        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
        }

        
    }
 public void addlast(int data) {
    Node newnode=new Node(data);
    if(head==null)
    {
        head=newnode;
        return;
    }
    Node currnode=head;
   // Node prevnode=head;
    while(currnode.next!=null)
    {
       // prevnode=currnode;
        currnode=currnode.next;
    }
      currnode.next=newnode;
      newnode.prev=currnode;
 }
 public void display() {
    Node tempnode=head;
    while(tempnode!=null)
    {
        System.out.print(tempnode.data+" ");
        tempnode=tempnode.next;
    }
 }
public static void main(String[]ags) {
    dl list=new dl();
    list.addlast(4);
    list.addlast(5);
    list.addlast(6);
    list.addlast(7);
    list.addlast(8);
    list.addlast(9);
    list.addlast(10);
    list.display();


}
public Node getHead() {
    return head;
}
public void setHead(Node head) {
    this.head = head;
}
}