import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

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

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int num = matrix[i][j];
                if (num == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        chayThu();
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int w1 = 0;
        int w2 = 0;

        int length = word1.length() <= word2.length() ? word1.length() : word2.length();

        for (int i = 0; i < length; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
            w1++;
            w2++;
        }
        while (w1 < word1.length()) {
            result.append(word1.charAt(w1++));
        }
        while (w2 < word2.length()) {
            result.append(word2.charAt(w2++));
        }

        return result.toString();
    }

    public static String gcdOfStrings(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        int length = str1.length() <= str2.length() ? str1.length() : str2.length();
        for (int i = 0; i < length; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                result.append(str1.charAt(i));
            }
        }
        return result.toString();
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> listResult = new ArrayList<Boolean>();
        int max = findMax(candies);
        for (int i = 0; i < candies.length; i++) {
            if (max > candies[i] + extraCandies) {
                listResult.add(false);
            } else {
                listResult.add(true);
            }
        }
        return listResult;
    }

    private static int findMax(int[] candies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        return max;
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0)
                    && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                count++;
                flowerbed[i] = 1;
            }

        }
        return count >= n ? true : false;
    }

    public static String reverseWords(String s) {
        String result = "";
        String work = "";
        List<String> works = new ArrayList<String>();
        int i = 0;

        while (s.length() > i) {
            if (s.charAt(i) == ' ' && (i == s.length() - 1 || s.charAt(i + 1) == ' ')) {
                i++;
                continue;
            } else if (s.charAt(i) != ' ') {
                work += s.charAt(i);
                i++;
            } else {
                works.add(work);
                work = "";
                i++;
            }

        }
        if (!work.isEmpty()) {
            works.add(work);
        }
        for (int j = works.size() - 1; j >= 0; j--) {
            result += works.get(j) + " ";
        }

        return result.trim();
    }

    private static void chayThu() {
        int[] a = { 10, 8, 2, -8, 14 };
        asteroidCollision(a);
        System.out.print("----------" + asteroidCollision(a).toString() + "----------  14 -8");
    }

    public static int[] asteroidCollision(int[] asteroids) {
        List<Integer> result = new ArrayList<Integer>();
        for (int num : asteroids) {
            result.add(num);
        }
        int slow = 0;
        int fast = 1;
        while (fast < result.size()) {
            int first = result.get(slow);
            int second = result.get(fast);
            if (first > 0 && second < 0) {
                // Xử lý trường hợp va chạm khi một tiểu hành tinh di chuyển sang phải và một
                // sang trái
                if (Math.abs(first) > Math.abs(second)) {
                    result.remove(fast); // Xóa tiểu hành tinh nhỏ hơn
                } else if (Math.abs(first) < Math.abs(second)) {
                    result.remove(slow); // Xóa tiểu hành tinh nhỏ hơn
                    slow = Math.max(0, slow - 1); // Điều chỉnh chỉ số slow
                    fast = slow + 1;
                } else {
                    // Nếu hai tiểu hành tinh có cùng độ lớn, xóa cả hai
                    result.remove(fast);
                    result.remove(slow);
                    slow = Math.max(0, slow - 1);
                    fast = slow + 1;
                }
            } else {
                // Không có va chạm, di chuyển tiếp
                slow++;
                fast++;
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static String removeStars(String s) {
        Stack<Character> str = new Stack<Character>();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                str.pop();
            } else {
                str.push(s.charAt(i));
            }

        }
        while (!str.isEmpty()) {
            result.append(str.pop());
        }
        result.reverse();
        return result.toString();
    }
}
