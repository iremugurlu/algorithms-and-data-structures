import java.util.*;

// You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. 
// Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> map = new HashMap<>();
        for(char jewel : jewels.toCharArray()) {
            map.putIfAbsent(jewel, 0);
        }
        for(char stone : stones.toCharArray()) {
            if(map.containsKey(stone)) {
                map.put(stone, map.get(stone)+1);
            }
        }
        int res = 0;
        for(char key : map.keySet()) {
            res += map.get(key);
        }
        return res;
     }
}