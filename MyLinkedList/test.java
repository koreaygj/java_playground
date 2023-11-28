package MyLinkedList;

import MyLinkedList.Test.MyLinkedList;

public class test {
  public static void main(String[] args) {
    MyLinkedList<String> test = new MyLinkedList<>();
    MyLinkedList<Integer> test2 = new MyLinkedList<>();
    
    test.add("test");
    test.add("gogo");
    test.add("keep");
    test2.add(1);
    test2.add(2);
    test2.add(3);

    test.printList();
    test2.printList();

    System.out.println(test.get(1));
    System.out.println(test2.get(1));

    test.remove(1);
    test2.remove(1);

    test.printList();
    test2.printList();
  }

}
