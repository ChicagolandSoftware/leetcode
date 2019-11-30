class Solution {
    public int[] twoSum(int[] nums, int target) {
        int returnArray[] = new int[2];
        int tempValue = 0;
        for (int i = 0; i < nums.length; i++) {
            tempValue = nums[i];
            returnArray[0] = i;
            for (int j = 1; j < nums.length; j++) {
                returnArray[1] = j;
                int total = tempValue + nums[j];
                if (total == target && (i != j)) {
                    return returnArray;
                }
            }
        }
        //not supposed to get here
        return returnArray;
    }
}