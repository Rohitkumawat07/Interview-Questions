public class LowerCase {
    public String lowercase(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c + 32));

            }

            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LowerCase up = new LowerCase();
        System.out.println(up.lowercase("Rohit Kumar"));
    }
}
