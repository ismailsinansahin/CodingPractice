package LeetCodeQuestions.TopInterviewQuestions.LinkedList;

public class $002_AddTwoNumbers {

    public static void main(String[] args) {

        ListNode idx2 = new ListNode(3);
        ListNode idx1 = new ListNode(4,idx2);
        ListNode l1 = new ListNode(2,idx1);

        ListNode idx4 = new ListNode(4);
        ListNode idx3 = new ListNode(6,idx4);
        ListNode l2 = new ListNode(5,idx3);

        ListNode current = l1;
        while(current != null){
            System.out.print(current.val);
            current = current.next;
        }

        System.out.println();
        System.out.println("*****************");

        current = l2;
        while(current != null){
            System.out.print(current.val);
            current = current.next;
        }

        System.out.println();
        System.out.println("*****************");

        current = addTwoNumbers(l1, l2);
        while(current != null){
            System.out.print(current.val);
            current = current.next;
        }


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        int total = 0;
        ListNode head = new ListNode();
        ListNode current = head;
        while(true){
            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }
            current.val = (total % 10);
            total = total / 10;
            if(l1 == null && l2 == null && total == 0) break;
            current.next = new ListNode();
            current = current.next;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
