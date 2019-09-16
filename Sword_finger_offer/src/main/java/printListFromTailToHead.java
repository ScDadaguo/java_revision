//输入一个链表，按链表从尾到头的顺序返回一个ArrayList。

import java.util.ArrayList;
import java.util.Stack;

public class printListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (!stack.empty()) {
            list.add(stack.pop());
        }
        return list;
    }

    class ListNode{
        int val;
        ListNode next=null;

        public ListNode(int val, ListNode next) {
            this.val = val;
        }
    }
}
