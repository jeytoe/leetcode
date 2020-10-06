package numberofgoodpairs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of integers nums.
 *
 * A pair (i,j) is called good if nums[i] == nums[j] and i < j.
 *
 * Return the number of good pairs.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1,1,3]
 * Output: 4
 * Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 * Example 2:
 *
 * Input: nums = [1,1,1,1]
 * Output: 6
 * Explanation: Each pair in the array are good.
 * Example 3:
 *
 * Input: nums = [1,2,3]
 * Output: 0
 */
public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int numberOfPairs = 0;
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                numberOfPairs += hashMap.get(nums[i]).size();
                hashMap.get(nums[i]).add(i);
            }else {
                ArrayList<Integer> listOfNums = new ArrayList<>();
                listOfNums.add(i);
                hashMap.put(nums[i], listOfNums);
            }
        }

        return numberOfPairs;
    }
}
