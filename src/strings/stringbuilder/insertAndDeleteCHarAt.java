package strings.stringbuilder;

public class insertAndDeleteCHarAt {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
    }
}
