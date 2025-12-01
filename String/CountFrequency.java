public class CountFrequency {

    public int[] countfrequency(String s) {
        int[] freq = new int[256];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        CountFrequency ct = new CountFrequency();
        int[] result = ct.countfrequency("Rohittrtsrtefrrrgddr");

        for (int i = 0; i < result.length; i++) {
            if (result[i] > 0) {
                System.out.println((char) i + " : " + result[i]);
            }

        }
    }
}