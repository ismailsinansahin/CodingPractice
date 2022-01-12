package LeetCodeQuestions.TopInterviewQuestions.LinkedList;

public class $021_MergeTwoSortedLists {

    public static void main(String[] args) {

//        ListNode node4 = new ListNode(6, null);
//        ListNode node3 = new ListNode(5, node4);
        ListNode node2 = new ListNode(3, null);
        ListNode list1 = new ListNode(1, node2);

        ListNode node7 = new ListNode(8, null);
        ListNode node6 = new ListNode(6, node7);
        ListNode node5 = new ListNode(4, node6);
        ListNode list2 = new ListNode(1, node5);

        System.out.println(mergeTwoLists(list1, list2).toString());
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null && list2 == null) return null;
        else if(list1 == null) return list2;
        else if(list2 == null) return list1;

        ListNode list = new ListNode();

        if(list1.val <= list2.val) {
            list = list1;
            list1 = list1.next;
        }
        else{
            list = list2;
            list2 = list2.next;
        }

        ListNode current = new ListNode();
        current = list;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            }
            else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 == null) current.next = list2;
        if(list2 == null) current.next = list1;

        return list;

    }

    public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) {
           this.val = val; }
       ListNode(int val, ListNode next) {
           this.val = val; this.next = next; }
    }

}
