package forwork;

public class 字符串压缩 {
    public String compressString(String S) {
        StringBuilder compressed = new StringBuilder();
        if (S.length() == 1) {
            return S;
        }
        int count = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(S.charAt(i - 1)).append(count);
                count = 1;
            }
            if (i == S.length() - 1) {
                compressed.append(S.charAt(i)).append(count);
            }
        }
        return compressed.length() < S.length()? compressed.toString() : S;
    }
}
