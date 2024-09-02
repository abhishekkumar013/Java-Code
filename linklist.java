
public class linklist {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void  addfirst(int data) {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void  addlast(int data) {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        Node currnode=head;
        while(currnode.next!=null)
        {
            currnode=currnode.next;
        }
       currnode.next=newnode;
        
    }
    /**
     * 
     */
    public void print() {
        {  if(head==null)
            {
                System.out.println("list is empty");
            }
            Node currnode=head;
            while(currnode!=null)
            {
                System.out.print(currnode.data+" ");
                currnode=currnode.next;
            }
        }
    }
    public static void main(String [] ags) {
        /**
      * @param args
      */
         linklist list=new linklist();
         list.addfirst(5);
         list.addfirst(4);
         list.addlast(6);
         list.addlast(7);
         list.addlast(8);
         list.addlast(9);
         list.print();
          
      }
    public Node getHead() {
        return head;
    }
    public void setHead(Node head) {
        this.head = head;
    }
}
