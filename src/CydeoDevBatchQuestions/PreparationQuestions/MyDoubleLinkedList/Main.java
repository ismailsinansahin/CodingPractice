package CydeoDevBatchQuestions.PreparationQuestions.MyDoubleLinkedList;

public class Main {

    public static void main(String[] args) {

        MyDoubleLinkedList list = new MyDoubleLinkedList();

//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(1);
//        list.add(2);
        list.add(3);
        list.add(4);
//        list.add(4);
//        list.add(4);
//        list.add(4);
//        list.add(4);
//        list.add(6);
//        list.add(6);
//        list.add(6);
//        list.add(6);


        System.out.println(list);

        list.removeDuplicatesFromSortedList();

        System.out.println(list);

    }

}
