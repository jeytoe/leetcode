package subtractproductandsum;

/**
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: n = 234
 * Output: 15
 * Explanation:
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15
 * Example 2:
 * <p>
 * Input: n = 4421
 * Output: 21
 * Explanation:
 * Product of digits = 4 * 4 * 2 * 1 = 32
 * Sum of digits = 4 + 4 + 2 + 1 = 11
 * Result = 32 - 11 = 21
 */
public class SubtractProductAndSumOfInteger {
    public int subtractProductAndSum(int n) {
        int temp = n;
        int sum = 0, product = 1;
        while (temp > 0) {
            sum += temp % 10;
            product *= temp % 10;
            temp = temp / 10;
        }
        return product - sum;
    }
}
