import java.util.*;

// You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. 
// Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        for(char jewel : jewels.toCharArray()) {
            if(!set.contains(jewel)) {
                set.add(jewel);
            }
        }
        int res = 0;
        for(char stone : stones.toCharArray()) {
            if(set.contains(stone)) {
                res++;
            }
        }
        return res;
     }
}