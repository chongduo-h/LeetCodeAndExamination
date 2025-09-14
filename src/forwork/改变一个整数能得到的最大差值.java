package forwork;

public class 改变一个整数能得到的最大差值 {

    public int maxDiff(int num) {
        String str = String.valueOf(num);
        char[] chars = str.toCharArray();
        char a = chars[0];
        char b = chars[0];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '9') {
                a = chars[i];
                break;
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]!= '1' && chars[i]!= chars[0]) {
                b = chars[i];
                break;
            }
        }
        String str1 = str.replace(a, '9');
        String str2 = str.replace(b, '0');
        return Integer.parseInt(str1) - Integer.parseInt(str2);
    }
}
