import java.util.Scanner;

public class circularlist {
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
        System.out.println("Enter data(-1 to stop): ");
        int num=sc.nextInt();
        while(num!=-1)
        {
            Node newnode=new Node(num);
            if(head==null)
            {
                head=newnode;
                head.next=head;
            }else{
                Node currnode=head;
                while(currnode.next!=head)
                {
                    currnode=currnode.next;
                }
                currnode.next=newnode;
                currnode=newnode;
                currnode.next=head;
            }
            System.out.println("Enter data(-1 to stop): ");
             num=sc.nextInt();
        }
    }
    public void display() {
        Node tempnode=head;
        while(tempnode.next!=head)
        {
            System.out.print(tempnode.data+" ");
            tempnode=tempnode.next;
        }System.out.print(tempnode.data+" ");
    }
    /**
     * @param ags
     */
    public static void main(String[] ags) {
        circularlist list=new circularlist();
        list.insert();
        list.display();
        
    }
}
