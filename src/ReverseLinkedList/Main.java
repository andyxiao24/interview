package ReverseLinkedList;

public class Main {
  public static void main(String[] args) {
    Node head = constructList(20);
    print(head);
    head = reverseListRecursive(head);
    print(head);
  }

  //反转链表
  public static Node reverseList(Node node) {
    return null;
  }

  /**
   * 反转链表，请用递归
   * @param head
   * @return
   */
  public static  Node reverseListRecursive(Node head) {
    return null;
  }

  public static Node constructList(final int size) {
    Node pre = null;
    Node head = null;
    for (int i = 0; i < size; i++) {
      Node current = new Node();
      current.data = i;
      if (null == pre) {
        pre = current;
        head = current;
      } else {
        pre.next = current;
        pre = current;
      }
    }
    return  head;
  }

  public static void print( Node head) {
    while(null != head) {
      System.out.print(String.format(" %d  -->  ", head.data));
      head = head.next;
    }
    System.out.println();
  }
}
