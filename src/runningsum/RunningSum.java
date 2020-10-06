package runningsum;

public class RunningSum {

    int[] solution(int[] nums) {
        int[] output = new int[nums.length];
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            output[i] = sum;
        }
        return output;
    }
}
