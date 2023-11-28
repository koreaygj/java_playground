package MyLinkedList.Test;

class Node<E> {
    E data;
    Node<E> next;
    Node(E data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList<E> {
  private Node<E> head; // head of the list

  public MyLinkedList() {
    this.head = null;
  }

  // Method to add a new node
  public void add(E data) {
      Node<E> newNode = new Node<>(data);
      if (head == null) {
          head = newNode;
      } else {
          Node<E> current = head;
          while (current.next != null) {
              current = current.next;
          }
          current.next = newNode;
      }
  }

  // get
  public E get(int index) {
    if (index < 0 || index >= size()) {
        throw new IndexOutOfBoundsException();
    }
    
    Node<E> current = head;
    int count = 0;
    while (current != null && count < index) {
        current = current.next;
        count++;
    }
    
    if (current == null) {
        throw new IndexOutOfBoundsException();
    }
    
    return current.data;
}

  // delete
  public E remove(int index){
    if (index < 0 || index >= size()) {
        throw new IndexOutOfBoundsException();
    }
    Node<E> current = head;
    if (index == 0) {
        head = head.next;
        return current.data;
    }
    int count = 0;
    while (current != null && count < index - 1) {
        current = current.next;
        count++;
    }
    if (current == null || current.next == null) {
        throw new IndexOutOfBoundsException();
    }
    Node<E> nodeToRemove = current.next;
    current.next = nodeToRemove.next;
    return nodeToRemove.data;
  }

  // printList
  public void printList() {
      Node<E> current = head;
      while (current != null) {
          System.out.print(current.data + " -> ");
          current = current.next;
      }
      System.out.println("NULL");
  }

  // size
  public int size() {
    int count = 0;
    Node<E> current = head;
    while (current != null) {
        count++;
        current = current.next;
    }
    return count;
}


  // Other methods like remove, find, etc. can be added here
}
