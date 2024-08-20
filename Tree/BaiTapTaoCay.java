package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BaiTapTaoCay {
    public static void main(String[] args) {

        AVLTree tree = new AVLTree();

        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 7);
        tree.root = tree.insert(tree.root, 9);
        tree.root = tree.insert(tree.root, 12);
        tree.root = tree.insert(tree.root, 15);
        tree.root = tree.insert(tree.root, 17);
        tree.root = tree.insert(tree.root, 21);
        tree.root = tree.insert(tree.root, 23);
        tree.root = tree.insert(tree.root, 25);
        tree.root = tree.insert(tree.root, 27);

        System.out.println("Phần tử thêm vào cây: ");
        tree.printTree();
    }

}

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return result;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            int lSize = queue.size();
            for (int i = 0; i < lSize; i++) {
                TreeNode curr = queue.poll();
                if (i == 0) {
                    result.add(curr.val);
                }

                if (curr.right != null) {
                    queue.offer(curr.right);
                }

                if (curr.left != null) {
                    queue.offer(curr.left);
                }

            }
        }
        return result;
    }
}