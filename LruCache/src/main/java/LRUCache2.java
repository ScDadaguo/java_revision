/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

import sun.java2d.SurfaceDataProxy;

import java.util.HashMap;

/**
 * @FileName: LRUCache2.java
 * @Description: LRUCache2.java类说明
 * @Author: guohao
 * @Date: 2019/8/21 9:36
 */
public class LRUCache2 {

    private HashMap<Integer, DlinkNode> cache;
    private DlinkNode head;
    private DlinkNode tail;
    //总容量
    private int size;
    //已有多少节点
    private int count;


    public LRUCache2(int size) {
        this.cache = new HashMap<>();
        head = new DlinkNode();
        tail = new DlinkNode();
        head.next = tail;
        tail.pre = head;
        this.size = size;

    }

    public void addNewNode(DlinkNode dlinkNode) {
        DlinkNode next = head.next;
        head.next = dlinkNode;
        dlinkNode.pre = head;
        dlinkNode.next = next;
        next.pre = dlinkNode;
    }

    public void removeNode(DlinkNode dlinkNode) {
        DlinkNode pre = dlinkNode.pre;
        DlinkNode next = dlinkNode.next;
        pre.next = next;
        next.pre = pre;
    }

    /**
     * 去掉一个最后面的节点
     */
    public void popTail() {
        DlinkNode dlinkNode = tail.pre;
        removeNode(dlinkNode);
        cache.remove(dlinkNode.val);
        count--;
    }

    public void moveToHead(DlinkNode dlinkNode) {
        removeNode(dlinkNode);
        addNewNode(dlinkNode);
    }

    public void put(int key, int val) {
        DlinkNode dlinkNode = cache.get(key);
        //如果没有存这个key
        if (dlinkNode==null) {
            if (count == size) {
                popTail();
            }
                DlinkNode newDlinkNode = new DlinkNode();
                newDlinkNode.val = val;
                cache.put(key, newDlinkNode);
                addNewNode(newDlinkNode);
                count++;
        } else {
            dlinkNode.val = val;
            moveToHead(dlinkNode);
        }
    }

    public int get(int key) {
        DlinkNode dlinkNode = cache.get(key);
        if (dlinkNode != null) {
            moveToHead(dlinkNode);
            return dlinkNode.val;
        } else {
            return -1;
        }


    }


    class DlinkNode {
        DlinkNode pre;
        DlinkNode next;
        int val;
    }

    public static void main(String[] args) {
        LRUCache2 lruCache = new LRUCache2(2);
        lruCache.put(1,1);
//        lruCache.get(1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);
        lruCache.put(4, 4);
        System.out.println(lruCache.get(2));
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(4));
    }
}
