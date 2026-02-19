import java.util.Arrays;

public class StringUtils {
    public static String reverse(String s) {
        StringBuilder res = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i));
        }

        return res.toString();
    }

    public static String explode(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s, 0, i + 1);
        }

        return sb.toString();
    }

    public static String sort(String s) {
        char[] res = s.toCharArray();
        Arrays.sort(res);
        return new String(res);
    }

    public static boolean anagrams(String s1, String s2) {
        return sort(s1).equals(sort(s2));
    }

    public static String swap(String s) {
        String[] splitSen = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < splitSen.length; i++) {
            char[] str = splitSen[i].toCharArray();
            char temp = str[0];
            str[0] = str[str.length - 1];
            str[str.length - 1] = temp;
            sb.append(str);
            sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
        System.out.println(explode("Baku"));
        System.out.println(sort("ZCASKJDH"));
        System.out.println(anagrams("Racecar", "carRace"));
        System.out.println(swap("This is PP2 Fall 2021"));
    }
}
