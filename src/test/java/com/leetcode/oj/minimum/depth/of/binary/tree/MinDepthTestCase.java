package com.leetcode.oj.minimum.depth.of.binary.tree;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class MinDepthTestCase {

    private static Solution solution = null;

    @BeforeClass
    public static void setup() {
        solution = new Solution();
    }

    @Test
    public void testWhenTreeIsNull() {
        TreeNode root = null;
        int depth = solution.minDepth(root);
        assertEquals("depth should be 0", 0, depth);
    }

    @Test
    public void testWhenTreeIsEmpty() {
        TreeNode root = new TreeNode(0);
        int depth = solution.minDepth(root);
        assertEquals("depth should be 1", 1, depth);
    }

    @Test
    public void testWhenTreeIsList() {
        TreeNode root = new TreeNode(0);
        TreeNode second = root.left = new TreeNode(1);
        second.left = new TreeNode(2);
        int depth = solution.minDepth(root);
        assertEquals("depth should be 3", 3, depth);
    }

    @Test
    public void testWhenTreeIsBalanced() {
        TreeNode root = new TreeNode(0);
        TreeNode rootLeft = root.left = new TreeNode(1);
        TreeNode rootRight = root.right = new TreeNode(1);
        rootLeft.left = new TreeNode(2);
        rootRight.left = new TreeNode(2);
        int depth = solution.minDepth(root);
        assertEquals("depth should be 3", 3, depth);
    }
}
