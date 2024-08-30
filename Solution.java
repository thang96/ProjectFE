import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
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

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();

        demLa(root1, result1);
        demLa(root2, result2);
        boolean result = result1.equals(result2);
        return result;
    }

    public void demLa(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            result.add(root.val);
        }
        demLa(root.left, result);
        demLa(root.right, result);
    }

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            }
        }

        return start;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList result = new ArrayList<>();
        int lengthNums = nums.length;
        for (int i = 0; i < lengthNums - 1; i++) {
            int j = i + 1;
            int k = lengthNums - 1;
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> listNums = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(listNums);
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        testRun();
    }
    private static void testRun() {
        int[][] matrix = {
            // {1, 3}, 
            {1, 2, 3, 0}, 
            {4, 5, 6, 9}, 
            {7, 2, 5, 5}
        };
        int target = 3;
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0; i<matrix.length;i++){
            for(int j = 0; j<matrix[i].length;j++){
                int num = matrix[i][j];
                if (num==target) {
                    return true;
                }
            }
        }
        return false;
    }
}
