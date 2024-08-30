import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        ArrayList result = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;
                } else if (nums[i] + nums[j] + nums[k] > 0) {
                    k--;
                } else {
                    List<Integer> listNums = Arrays.asList(nums[i], nums[j], nums[k]);
                    result.add(listNums);

                }
            }
        }
        return result;
    }
}
