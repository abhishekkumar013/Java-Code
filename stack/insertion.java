

public  class insertion {
   // Node stack;
   static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    static class stack{
        public static Node head;
        public static boolean isempty() {
            return head==null;
        }
        public static void push(int data) {
            Node newnode=new Node(data);
            if(isempty())
            {
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public static int pop() {
            if(isempty())
            {
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peak() {
            if(isempty())
            {
                return -1;
            }
            return head.data;
        }
    }
    


    public static void main(String[] ags) {
        stack list=new stack();
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.push(6);
        list.push(7);
        while(!list.isempty())
        {
            System.out.println(list.peak());
            list.pop();
        }
    }
}
