package forwork;

public class URL化 {
//    public String replaceSpaces(String S, int length) {
//        StringBuilder sb = new StringBuilder(length);
//        for (int i = 0; i < length; i++) {
//            sb.append(S.charAt(i) ==' ' ? "%20" : String.valueOf(S.charAt(i)));
//        }
//        return sb.toString();
//    }

    public static void main(String[] args) {
        URL化 urlify = new URL化();
        String input = "Mr John Smith";
        int length = 13;
        System.out.println(urlify.replaceSpaces(input, length));
    }

    public String replaceSpaces(String S, int length) {
        //先把字符串转化为字符数组
        char[] word = new char[length];
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            word[i] = S.charAt(i);
            if (' ' == S.charAt(i)) {
                spaceCount++;
            }
        }
        char[] res = new char[length + spaceCount * 2];
        int forword = 0;
        for (char i : word) {
            if (' ' == i) {
                res[forword++] = '%';
                res[forword++] = '2';
                res[forword++] = '0';
            } else {
                res[forword++] = i;
            }
        }
        return String.valueOf(res);
    }
}

