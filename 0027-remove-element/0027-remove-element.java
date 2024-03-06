class Solution {
    public int removeElement(int[] nums, int val) {
          int p1 = 0, p2 = nums.length - 1;

        while (p1 <= p2) {
            if (nums[p1] == val) {
                swap(nums, p1, p2);
                p2--;
            } else {
                p1++;
            }
        }

        return p1;
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}