package forwork;

public class 字符串轮转 {

    public boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        }
        String s1s1 = s1 + s1;
        return s1s1.contains(s2);
    }

}
