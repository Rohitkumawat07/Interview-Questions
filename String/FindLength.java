public class FindLength {
    public int findlengthwithoutlength(String s){
        int length = 0;

        for( char c : s.toCharArray()){
            length ++;
        }
        return length;
    }
    public static void main(String[] args) {
        FindLength str  = new FindLength();
        System.out.println(str.findlengthwithoutlength("Rohit"));
    }
}
