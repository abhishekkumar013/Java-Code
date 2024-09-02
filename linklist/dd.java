import java.util.Scanner;

public class dd{

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
   public void insert() {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter data(-1 to stop): ");
    int num=sc.nextInt();
    while(num!=-1)
    {
        Node newnode=new Node(num);
        if(head==null)
        {
            head=newnode;
        }else{
            Node currnode=head;
            while(currnode.next!=null)
            {
                currnode=currnode.next;
            }
            currnode.next=newnode;
            currnode=newnode;
        }
        System.out.print("Enter data(-1 to stop): ");
         num=sc.nextInt();
    }
}
public void delete_last()
{
    Node prev=head;
    Node curr=head;
    while(curr.next!=null)
    {
        prev=curr;
        curr=curr.next;
    }
    prev.next=null;

}
public void delete_first()
{
    Node next=head.next;
    Node curr=head;
    if(head!=null)
    {
        curr=next;
        head=curr;
    }

}
public void delete_pos()
{ 
    Scanner sc=new Scanner(System.in);
    System.out.println(" ");
    System.out.print("Enter Pos: ");
    int pos=sc.nextInt();
    Node prev=head;
    Node curr=head;
    int count=0;
    while(count<pos)
    {
        ++count;
        prev=curr;
        curr=curr.next;
    }
    prev.next=curr.next;




}
/**
 * 
 */
public void display() {
    if(head==null)
    {
        System.out.println("Head is NULL");
    }
    Node tempnode=head;
    while(tempnode!=null)
    {
        System.out.print(tempnode.data+" ");
        tempnode=tempnode.next;
    }
}

    public static void main(String[] ags) {
        dd list=new dd();
        list.insert();
        list.display();
        list.delete_last();
        System.out.println(" ");
        list.display();
        list.delete_first();
        System.out.println(" ");
        list.display();
        list.delete_pos();
        System.out.println(" ");
        list.display();
    }
}