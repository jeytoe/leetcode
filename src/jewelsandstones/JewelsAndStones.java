package jewelsandstones;

import java.util.HashMap;

/**
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.
 * <p>
 * The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".
 * <p>
 * Example 1:
 * <p>
 * Input: J = "aA", S = "aAAbbbb"
 * Output: 3
 * Example 2:
 * <p>
 * Input: J = "z", S = "ZZ"
 * Output: 0
 */
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> characterHashMap = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            if (characterHashMap.containsKey(S.charAt(i))) {
                int numberOfStones = characterHashMap.get(S.charAt(i)) + 1;
                characterHashMap.put(S.charAt(i), numberOfStones);
            } else {
                characterHashMap.put(S.charAt(i), 1);
            }
        }

        int numberOfJewels = 0;
        for (int i = 0; i < J.length(); i++) {
            if (characterHashMap.containsKey(J.charAt(i))) {
                numberOfJewels += characterHashMap.get(J.charAt(i));
            }
        }

        return numberOfJewels;
    }
}
