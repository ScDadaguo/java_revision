/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

import java.util.HashMap;

/**
 * @FileName: LRUCache.java
 * @Description: LRUCache.java类说明
 * @Author: guohao
 * @Date: 2019/8/20 18:32
 */
public class LRUCache {


    private HashMap<Integer, DLinkedNode> cache = new HashMap<Integer, DLinkedNode>();

    /**
     * 当前的大小，当前有多少个节点
     */
    private int count;
    /**
     * 总的容量大小
     */
    private int capacity;

    private DLinkedNode head, tail;


    public LRUCache(int capacity) {
        this.count = 0;
        this.capacity = capacity;

        head = new DLinkedNode();
        head.pre = null;

        tail = new DLinkedNode();
        tail.post = null;

        head.post = tail;
        tail.pre = head;
    }

    /**
     * 挪到开头
     */
    private void moveToHead(DLinkedNode node) {
        //摘除目标节点
        removeNode(node);

        //把节点放到头节点后面去
        addNode(node);


    }

    /**
     * 摘除目标节点
     * @param node
     */
    private void removeNode(DLinkedNode node) {
        DLinkedNode pre = node.pre;
        DLinkedNode post = node.post;
        pre.post = post;
        post.pre = pre;
    }

    /**
     * //把节点放到头节点后面去
     * @param node
     */
    private void addNode(DLinkedNode node) {
        node.pre = head;
        node.post = head.post;
        head.post.pre = node;
        head.post = node;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        //cache命中，挪到开头
        moveToHead(node);
        return node.value;
    }

    /**
     * 弹出一个尾巴节点
     * @return
     */
    private DLinkedNode popTail() {
        DLinkedNode res = tail.pre;
        removeNode(res);
        return res;
    }


    public void put(int key, int value) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            DLinkedNode newNode = new DLinkedNode();
            newNode.value = value;
            newNode.key = key;
            cache.put(key, newNode);
            //节点放到头节点后面去
            addNode(newNode);
            ++count;
            if (count > capacity) {
                DLinkedNode tail = this.popTail();
                //remove key
                cache.remove(tail.key);
                count--;
            }
        } else {
            //cache命中，更新cache
            node.value = value;
            moveToHead(node);
        }
    }


    private static class DLinkedNode {
        int key;

        int value;
        /**
         * 前一个节点
         */
        DLinkedNode pre;
        /**
         * 后一个节点
         */
        DLinkedNode post;
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1,1);
//        lruCache.get(1);
        lruCache.put(2, 2);
        lruCache.put(3, 3);
        System.out.println(lruCache.get(2));
        System.out.println(lruCache.get(1));

    }
}
