

public class linklis {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
  
    public void addfirst(String data) {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    
    public void addlast(String data) {
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
        linklis list=new linklis();
        list.addfirst("a");
        list.addfirst("is");
        list.addlast("list");
        list.print();
         
     }
    
    public Node getHead() {
        return head;
    }
    public void setHead(Node head) {
        this.head = head;
    }
}
