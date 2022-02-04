//structure of a node class for singly linked list
class Node {
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
    Node head;
    public void insertAtLast(Node newnode)
    {
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp =temp.next=newnode;
            }
        }
    }
}
public class ttt{
    public static  void main(String args[])
    {
        SinglyLinkedList obj1=new SinglyLinkedList();
        obj1.insertAtLast(new Node(10));
        obj1.display();
    }
}
