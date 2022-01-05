package LeetCodeQuestions.TopInterviewQuestions.LinkedList;

public class $708_InsertIntoCircularLinkedList {

    public static void main(String[] args) {

//        ListNode list = null;

        Node list = new Node(10);
        list.next = list;
        Node idx6 = new Node(70,list);
        Node idx5 = new Node(60,idx6);
        list.next = idx5;

        Node current = list;
//        System.out.print(list.val);
//        insertIntoCircularLinkedList(list, 5);
//        System.out.println();
//        System.out.print(list.val);
//        System.out.print(list.next.val);
//        System.out.print(list.next.next.val);
        while(current.next != list){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println(current.val);

        insertIntoCircularLinkedList(list, 5);
        current = list;

        while(current.next != list){
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.print(current.val + " ");
        System.out.println(current.next.val);

    }

    public static Node insertIntoCircularLinkedList(Node list, int insertVal){

        if (list == null) return new Node(insertVal);
        if (list.next == list) {
            list.next = new Node(insertVal, list);
            return list;
        }

        Node current = list;
        while(current.next != list) {
            if ((insertVal >= current.val) && (insertVal <= current.next.val)) {
                insert(insertVal, current);
                return list;
            }
            else if ((current.val > current.next.val) && ((insertVal >= current.val) || (insertVal <= current.next.val))) {
                insert(insertVal, current);
                return list;
            }
            else current = current.next;
        }
        Node newNode = new Node();
        current.next = newNode;
        newNode.val = insertVal;
        newNode.next = list;
        return list;
    }

    public static void insert(int insertVal, Node current){
        Node newNode = new Node();
        newNode.val = insertVal;
        newNode.next = current.next;
        current.next = newNode;
    }

    public static class Node {
        int val;
        Node next;
        Node() {}
        Node(int val) { this.val = val; }
        Node(int val, Node next) { this.val = val; this.next = next; }
    }

}
