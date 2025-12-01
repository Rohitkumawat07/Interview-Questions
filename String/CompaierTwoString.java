public class CompaierTwoString{
    public boolean compairetwostring(String s, String b){
        if(s.length() != b.length()){
            return false;
        }

        for(int i =0; i<s.length();i++){
            if(s.charAt(i) != b.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String [] args){
        CompaierTwoString st = new CompaierTwoString();
        System.out.println(st.compairetwostring("Rohit" ,"Rohit"));
    }
}