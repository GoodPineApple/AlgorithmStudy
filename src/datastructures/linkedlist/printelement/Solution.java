package datastructures.linkedlist.printelement;

/**
 * Created by taemi on 2017-07-21.
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list
 */
public class Solution {
    public static void main(String[] args) {
        /*linkedList의 형식.
        각 노드는 값과 다음 노드의 주소값을 갖고 있다.
        이에 대한 Print는 아래와같이 해당 값을 출력하고 다음 노드를 불러오면됨.
        */
    }
    class Node {
        int data;
        Node next;
    }
    void Print(Node head) {
        if (head != null) {
            System.out.println(head.data);
            Print(head.next);
        }
    }
}
