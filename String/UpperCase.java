public class UpperCase {
    public String uppercase(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append((char) (c - 32));

            }

            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        UpperCase up = new UpperCase();
        System.out.println(up.uppercase("rohit"));
    }
}
