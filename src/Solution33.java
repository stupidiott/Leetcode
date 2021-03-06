public class Solution33 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = left +(right - left) / 2;
            if (nums[mid] == target){
                return mid;
            }
            if (nums[0] < nums[mid]){   //45678123
                if (nums[0] <= target && target < nums[mid]){
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }else {     //6712345
                if (nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,1};
        int n = new Solution33().search(nums, 1);
        System.out.println(n);
    }
}
