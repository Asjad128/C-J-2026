
// public class TwoSum {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i = 0; i < nums.length; i++) {
//             int complement = target - nums[i];
//             if (map.containsKey(complement)) {
//                 return new int[] { map.get(complement), i };
//             }
//             map.put(nums[i], i);
//         }
//         throw new IllegalArgumentException("No two sum solution");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         TwoSum twoSum = new TwoSum();
//         int[] nums = {2, 7, 11, 15};
//         int target = 9;
//         int[] result = twoSum.twoSum(nums, target);
//         System.out.println("Indices: " + result[0] + ", " + result[1]);
//     }
// }

public class two_sum{
    public static void main(String[] args){
        int nums[] = {2, 7, 11, 15};
        int target = 9;

        for (int i=0; i < nums.length; i++){
            for (int j=i+1; j < nums.length; j++){
                if (i != j && nums[i] + nums[j] == target){
                    System.out.println("Indices: " + i + ", " + j);
                }
            }
        }
    }
}