/*
 * Copyright: 2019 dingxiang-inc.com Inc. All rights reserved.
 */

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @FileName: PrintFromTopToBottom.java
 * @Description: 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * @Author: guohao
 * @Date: 2019/8/24 13:07
 */
public class PrintFromTopToBottom {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList list = new ArrayList();
        Queue<TreeNode> queue = new LinkedList();
            if (root == null) {
                return list;
        }
        queue.offer(root);
        while (queue != null) {
            TreeNode temp = queue.poll();
            list.add(temp);
            if (root.left != null) {
                queue.offer(root.left);
            }
            if (root.right != null) {
                queue.offer(root.right);
            }
        }
        return list;
    }



    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
}
