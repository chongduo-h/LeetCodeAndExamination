package forwork;

public class 一次编辑 {
    public boolean oneEditAway(String first, String second) {
        int m = first.length();
        int n = second.length();
        if (Math.abs(m - n) > 1) return false;
        int count = 0;
        int i = 0, j = 0;
        while (i < m && j < n) {
            if (first.charAt(i) == second.charAt(j)) {
                i++;
                j++;
            } else {
                count++;
                if (count > 1) return false;
                if (m > n) i++;
                else if (m < n) j++;
                else {
                    i++;
                    j++;
                }
            }
        }
        return count <= 1;
    }
}
