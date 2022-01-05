package CydeoDevBatchQuestions.PreparationQuestions.MyDoubleLinkedList;

public class MyDoubleLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public void setHead(Node node){
        if(size == 0){
            head = node;
            tail = node;
        }
        else{
            head.prev = node;
            node.next = head;
            head = node;
        }
        size++;
    }

    public void setTail(Node node){
        if(size == 0){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
        size++;
    }

    public void insertAfter(Node node, Node nodeToInsert){
        if(node == tail) setTail(node);
        else {
            nodeToInsert.next = node.next;
            nodeToInsert.prev = node;
            node.next.prev = nodeToInsert;
            node.next = nodeToInsert;
        }
        size++;
    }

    public void insertBefore(Node node, Node nodeToInsert){
        if(node == head) setHead(node);
        else{
            nodeToInsert.prev = node.prev;
            nodeToInsert.next = node;
            node.prev.next = nodeToInsert;
            node.prev = nodeToInsert;
        }
        size++;
    }

    public void remove(Node node){
        if(size == 1) {
            head = null;
            tail = null;
        }
        else if(node == head){
            head = head.next;
            head.prev = null;
        }
        else if(node == tail){
            tail = tail.prev;
            tail.next = null;
        }
        else{
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        size--;
    }

    public void insertAfterValue(Node nodeToInsert, int value){
        Node node = nodeAt(indexOf(value));
        insertAfter(node, nodeToInsert);
    }

    public void insertAtPosition(int position, Node nodeToInsert){
        Node node = nodeAt(position);
        insertBefore(node, nodeToInsert);
    }

    public void removeNodesWithValue(int value){
        Node node = nodeAt(indexOf(value));
        remove(node);
    }

    public boolean containsNodeWithValue(int value) {
        return (indexOf(value) != -1);
    }

    public void add(int data){
        Node nodeToInsert = new Node(data);
        setTail(nodeToInsert);
    }

    public int indexOf(int value){
        for(int i=0 ; i<size ; i++) {
            if (nodeAt(i).value == value) return i;
        }
        return -1;
    }

    public Node nodeAt(int index){
        if(index > size || index < 0) throw new IndexOutOfBoundsException();
        if(index == 0) return head;
        if(index == size) return tail;
        Node current = head;
        for(int i=0; i<index ; i++){
            current = current.next;
        }
        return current;
    }

    public String toString(){
        if (head == null) return "[]";
        else{
            String result = "[" + head.value;
            Node current = head.next;
            while(current != null){
                result += ", " + current.value;
                current = current.next;
            }
            result += "]";
            return  result;
        }
    }

    public int getSize(){
        return size;
    }

    public void removeDuplicatesFromSortedList(){
        for(int i=0 ; i<size-1 ; i++){
            if(nodeAt(i).value == nodeAt(i+1).value){
                remove(nodeAt(i));
                i--;
            }
        }
    }

}
