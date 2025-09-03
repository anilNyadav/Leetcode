class Solution {
    public int[] twoSum(int[] nums, int target) {

            // create a map to store numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // check if complement already exists in the map
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // put current number in the map
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    // main method to test
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = solution.twoSum(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}