//structure of a node class for singly linked list
class Node {
    public boolean next;
    int data;
    Node bext; //self refrential structure to hold the reference of the next element
    public Node(int data)
    {
        this.data=data;
    }
}


//
//lll
class SinglyLinkedList
{
    public int next;
    Node head;
    public void insertAtLast(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            int next;
            Node temp=head;
            while(temp!=null)
            {
                temp =newnode;
            }
        }
    }

    public static  void main(String args[])
    {
        SinglyLinkedList obj1=new SinglyLinkedList();
        obj1.insertAtLast(new Node(10));

    }
}
