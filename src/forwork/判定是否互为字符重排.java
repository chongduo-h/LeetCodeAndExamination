package forwork;

import java.util.HashMap;
import java.util.Map;

public class 判定是否互为字符重排 {
    public boolean CheckPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        Map<Character,Integer> s1Map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            int count = s1Map.getOrDefault(c, 0) - 1;
            if (count < 0) {
                return false;
            }
            s1Map.put(c, count);
        }
        return true;
    }
}
