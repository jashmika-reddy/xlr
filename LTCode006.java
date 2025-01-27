import java.util.*;
public class LTCode006 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};
        int[] result = removeDuplicates(nums);
        System.out.println("Array without duplicates: " + Arrays.toString(result));
        int numOfDuplicates = nums.length - result.length;
        System.out.println("Number of duplicate values: " + numOfDuplicates);
    }
    public static int[] removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int[] temp = new int[nums.length];
        int k = 0;
        temp[k++] = nums[0]; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                temp[k++] = nums[i];
            }
        }
        return Arrays.copyOf(temp, k);
    }
}
