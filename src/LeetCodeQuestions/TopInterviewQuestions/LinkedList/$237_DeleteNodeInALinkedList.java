package LeetCodeQuestions.TopInterviewQuestions.LinkedList;

public class $237_DeleteNodeInALinkedList {

    public static void main(String[] args) {
        ListNode listnode = new ListNode();
//        listnode.addNode(new ListNode(4));
//        listnode.addNode(new ListNode(5));
//        listnode.addNode(new ListNode(1));
//        listnode.addNode(new ListNode(9));
//        listnode.toStringNode();
//        listnode.deleteNode();
    }

    public static class ListNode {

        int val;
        ListNode front;
        ListNode end;
        ListNode current;
        ListNode next;
        ListNode previous;

        ListNode() {front=null;}

        ListNode(int x) {val = x;}

//        public void toStringNode(){
//            if(front==null){
//                System.out.print("[]");
//            }else{
//                current=front;
//                System.out.print("[" + current.val);
//                while(current.next!=null){
//                    current=current.next;
//                    System.out.print("," + current.val);
//                }
//                System.out.print("]");
//            }
//        }
//
//        public void addNode(ListNode node) {
//            int value = node.val;
//            if(front == null){
//                front = node;
//            }else{
//                current = front;
//                while(current.next != null){
//                    current = current.next;
//                }
//                current.next = node;
//            }
//        }

        public void deleteNode(ListNode node) {
            if(front.val==node.val){
                front = front.next;
            }else{
                current = front;
                if(current.val==node.val){
                    current.next=current.next.next;
                }
            }
        }

    }

}
