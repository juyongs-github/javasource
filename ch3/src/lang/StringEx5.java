package lang;

public class StringEx5 {
    public static void main(String[] args) {
        System.out.println(count("12345AB12345AB345AB", "AB"));
        System.out.println(count("12345BC", "AB"));
    }

    public static int count(String src, String target) {
        // target이 src 내에 몇번 나오는지 return
        // indexOf()
        int cnt = 0;
        int pos = 0;
        while ((pos = src.indexOf(target, pos)) != -1) {
            pos += target.length();
            // src = src.substring(src.indexOf(target) + target.length() - 1);
            cnt++;
        }
        return cnt;
    }

    public static int count2(String src, String target) {
        // target이 src 내에 몇번 나오는지 return
        int cnt = 0;
        src = src.replaceAll(target, ".");
        for (char c : src.toCharArray()) {
            if (c == '.') {
                cnt++;
            }
        }
        return cnt;
    }
}
