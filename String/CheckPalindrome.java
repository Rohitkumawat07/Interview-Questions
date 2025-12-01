public class CheckPalindrome {
    public boolean checkpalindrome(String s){
        char [] arr = s.toCharArray();
        int n = arr.length-1 ,i =0;

        while(i<n){
            if(s.charAt(i) != s.charAt(n)){
                return false;
            }
            i++;
            n--;
        }
        return true;
    }
    public static void main(String[] args) {
        CheckPalindrome pd = new CheckPalindrome();
        System.out.println(pd.checkpalindrome("nitin"));
    }
    
}
