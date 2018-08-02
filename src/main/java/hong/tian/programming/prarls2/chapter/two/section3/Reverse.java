package hong.tian.programming.prarls2.chapter.two.section3;

/**
 * @author hong.tian
 * @date 2018/8/2 11:35
 */
public class Reverse {

    public static void main(String[] args) {

        // 使其变成 "defghabc";
        String str = "abcdefgh";
        System.out.println(reverse(str,3));

    }


    private static String reverse(String str, int i) {
        int n = str.length();
        String s1 = inPlaceReverse(str.substring(0,i));
        String s2 = inPlaceReverse(str.substring(i,n));
        return inPlaceReverse(s1+s2);
    }

    public static String inPlaceReverse(final String input) {
        final StringBuilder builder = new StringBuilder(input);
        int length = builder.length();
        for (int i = 0; i < length / 2; i++) {
            final char current = builder.charAt(i);
            final int otherEnd = length - i - 1;
            builder.setCharAt(i, builder.charAt(otherEnd)); // swap
            builder.setCharAt(otherEnd, current);
        }
        return builder.toString();
    }


}
