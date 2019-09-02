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
    private HashMap<Integer, DLinkedNode> cache;
    private DLinkedNode head;
    private DLinkedNode tail;
    private int count;
    private int capacity;

    public LRUCache2(int capacity) {
        this.capacity = capacity;
        cache = new HashMap<Integer, DLinkedNode>();

        //初始化双向链表
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.pre = head;

    }

    /**
     * 把目标节点从双向链表中摘除
     * @param node
     */
    private void removeNode(DLinkedNode node) {
        DLinkedNode pre = node.pre;
        DLinkedNode next = node.next;
        pre.next = next;
        next.pre = pre;
    }

    private void moveToHead(DLinkedNode node) {
        DLinkedNode next = head.next;
        head.next = node;
        node.pre = head;
        node.next = next;
        next.pre = node;
    }


    public void put(Integer key, Integer value) {
        //如果放进去本来就有，就更新缓存，同时把该节点放到头上
        if (cache.get(key) != null) {
            DLinkedNode node = cache.get(key);
            node.value = value;
            removeNode(node);
            moveToHead(node);
        } else {
            DLinkedNode node = new DLinkedNode();
            node.value = value;
            node.key = key;
            moveToHead(node);
            cache.put(key, node);
            count++;
            if (count > capacity) {
                //弹出尾巴节点
                DLinkedNode node1 = tail.pre;
                removeNode(node1);
                cache.remove(node1.key);
                count--;
            }
        }
    }

    public Integer get(Integer key) {
        if (cache.get(key) == null) {
            return -1;
        } else {
            DLinkedNode node = cache.get(key);
            removeNode(node);
            moveToHead(node);
            return node.value;
        }
    }





    private class DLinkedNode {
        int key;
        int value;

        DLinkedNode pre;
        DLinkedNode next;

    }

    public static void main(String[] args) {
        LRUCache2 lruCache = new LRUCache2(2);
        lruCache.put(1,1);
//        lruCache.get(1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);
        System.out.println(lruCache.get(2));
        System.out.println(lruCache.get(1));

    }
}
