import java.util.HashMap;

public class TwoSum {

    //Implementation of basic two sum problem using hash map
    public int[] twoSum(int[] nums, int target) {
        // A mapping from the value to its index.
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int j = 0; j < nums.length; j++) {
            int other = target - nums[j];
            if (map.containsKey(other) && map.get(other) != j) {
                result[0] = j;
                result[1] = map.get(other);
                break;
            }
        }

        return result;
    }
    public static void main(String[] args) {

    }
}

