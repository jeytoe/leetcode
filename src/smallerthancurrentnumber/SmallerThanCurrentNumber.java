package smallerthancurrentnumber;

import a.Utilities;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 *
 * Return the answer in an array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [8,1,2,2,3]
 * Output: [4,0,1,1,3]
 * Explanation:
 * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
 * For nums[1]=1 does not exist any smaller number than it.
 * For nums[2]=2 there exist one smaller number than it (1).
 * For nums[3]=2 there exist one smaller number than it (1).
 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 * Example 2:
 *
 * Input: nums = [6,5,4,8]
 * Output: [2,1,0,3]
 * Example 3:
 *
 * Input: nums = [7,7,7,7]
 * Output: [0,0,0,0]
 */
public class SmallerThanCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] buckets = new int[nums.length + 1];
        for(int num: nums){
            buckets[num]++;
        }
        new Utilities().printArray(buckets);

        int[] copiedArray = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copiedArray);
        HashMap<Integer, Integer> numberOfSmallerNumbersMap = new HashMap<>();
        int pointer = copiedArray[0];
        int smallerNumberCounter = 0;
        int sameNumbersCounter = 0;
        // 1,1,2,2,3,6,8 -> 0,0,2,2,4,5,6
        for (int i = 0; i < copiedArray.length; i++) {
            if (pointer == copiedArray[i]) {
                sameNumbersCounter++;
            }else {
                pointer = copiedArray[i];
                smallerNumberCounter += sameNumbersCounter;
                sameNumbersCounter = 1;
            }
            numberOfSmallerNumbersMap.put(copiedArray[i], smallerNumberCounter);
        }
        int[] output = new int[nums.length];
        for (int i = 0; i < output.length; i++) {
            output[i] = numberOfSmallerNumbersMap.get(nums[i]);
        }
        new Utilities().printArray(output);
        return output;
    }
}
