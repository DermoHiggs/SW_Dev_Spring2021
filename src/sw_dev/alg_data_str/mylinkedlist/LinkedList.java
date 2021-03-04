package sw_dev.alg_data_str.mylinkedlist;

class LinkedList {
    Node head; // head of list

    public void addToStart(int val)
    {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public void printList()
    {
        //us this to "walk" or traverse the list
        Node current = head;
        while(current != null){
            System.out.print(current.data + ", ");
            current = current.next;
        }
    }

    /* Linked list Node*/
    private class Node {
        int data;
        Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }
}

