package forwork;

public class 回文排列 {
    public boolean canPermutePalindrome(String s) {
        int[] count = new int[256];
        for (char c : s.toCharArray()) {
            count[c]++;
        }
        int oddCount = 0;
        for (int i : count) {
            oddCount += i % 2;
        }
        return oddCount <= 1;
    }
}
