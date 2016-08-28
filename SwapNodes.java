public class SwapNodes{

    public void swap(Node head, int min,int max)
    {
        int mid = (min + max)/2;
        Node curr = head;
        Node p1 = head;
        Node newhead = null;
        Node p2 = null;
        Node p1N = null;
        Node p2N = null;
        while(mid>0)
        {
            curr = curr.next;
            mid--;
        }
        newhead = curr.next;
        curr.next = null;
        p2 = reverse(newhead);
        p1N = p1.next;
        p2N = p2.next;
        
        while(p1!=null && p2!=null)
        {
            p1N = p1.next;
            p2N = p2.next;
            p1.next = p2;
            p2.next = p1N;
            p1 = p1N;
            p2 = p2N;
        }
    }
    
    public Node reverse (Node head)
    {
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    public void display(Node head)
    {
        Node curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    
    public static int length(Node head)
    {
        int count = 0;
        Node curr = head;
        while(curr!=null)
        {
            curr = curr.next;
            count ++;
        }
        return count;
    }
    
     public static void main(String []args){
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        
        SwapNodes s = new SwapNodes();
        s.display(head);
        int len = s.length(head);
        s.swap(head,0,len);
        System.out.println("The LL after swapping : ");
        s.display(head);
     }
}

class Node
{
    int data;
    Node next;
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
