public class ReverseString {
    public String reversestring(String s){
        
        char [] arr = s.toCharArray();
        int n = arr.length-1 ,i=0;
        
        while(i<n){
            char temp = arr[i];
            arr[i] = arr[n];
            arr[n]= temp;
            i++;
            n--;
        }
        return new String(arr);

    }
    public static void main(String[] args) {
        ReverseString st = new ReverseString();
        System.out.println(st.reversestring("Rohit kumar"));
    }
    
}
