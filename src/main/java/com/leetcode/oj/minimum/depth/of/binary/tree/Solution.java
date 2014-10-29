package com.leetcode.oj.minimum.depth.of.binary.tree;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * Given a binary tree, find its minimum depth.<br>
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.<br>
 */
public class Solution {

    public int minDepth(TreeNode root) {
        if (null == root) return 0;
        if (null == root.left && null == root.right) return 1;
        int minDepth = 1;
        Queue<TreeNode> unvisited = new ArrayDeque<TreeNode>();
        unvisited.add(root);
        TreeNode node = null;
        TreeNode parent = null;
        // Key is child, Value is parent
        Map<TreeNode, TreeNode> childParentRelation = new HashMap<TreeNode, TreeNode>();
        while (!unvisited.isEmpty()) {
            node = unvisited.poll();
            if (null != node.left) {
                unvisited.add(node.left);
                childParentRelation.put(node.left, node);
            }
            if (null != node.right) {
                unvisited.add(node.right);
                childParentRelation.put(node.right, node);
            }

            // node is first leaf in the same layer
            if (null == node.left && null == node.right) {
                break;
            }
        }
        while (null != (parent = childParentRelation.get(node))) {
            minDepth++;
            node = parent;
        }
        return minDepth;
    }

}
