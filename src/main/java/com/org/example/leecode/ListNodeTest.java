package com.org.example.leecode;


public class ListNodeTest {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode() {

        }

        public ListNode(int val) {
            this.val = val;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return val + "";
        }
    }

    public static void main(String[] args) {
        test1();
    }

    public static ListNode getFirstCommonNode(ListNode node1, ListNode node2) {

        int length1 = getListNodeLength(node1);
        int length2 = getListNodeLength(node2);

        ListNode longListNode = node1;
        ListNode sortListNode = node2;

        int diff = length1 - length2;
        if (diff < 0) {
            longListNode = node2;
            sortListNode = node1;
            diff = length2 - length1;
        }
        for (int i = 0; i < diff; i++) {
            longListNode = longListNode.next;
        }
        while (longListNode != null && sortListNode != null && longListNode!= sortListNode){
            longListNode = longListNode.next;
            sortListNode = sortListNode.next;
        }
        return longListNode;
    }

    /**
     * 返回链表长度.
     *
     * @param listNode 链表
     * @return length
     */
    public static int getListNodeLength(ListNode listNode) {
        int result = 0;
        while (listNode != null) {
            result++;
            listNode = listNode.next;
        }
        return result;
    }
    public static void test1(){
        // 第一个公共结点在链表中间
        // 1 - 2 - 3 \
        //            6 - 7
        //     4 - 5 /
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n7 = new ListNode(7);

        n1.next = n2;
        n2.next = n3;
        n3.next = n6;
        n6.next = n7;

        n4.next = n5;
        n5.next = n6;

        System.out.println(getFirstCommonNode(n1, n4)); // 6

    }

}

