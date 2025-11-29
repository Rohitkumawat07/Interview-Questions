public class RemoveSpace {
    public String removespace(String s){
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if( c != ' '){
                sb.append(c);
            }
            
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        RemoveSpace rm =new RemoveSpace();
        System.out.println(rm.removespace("Rohit Kumar Kumawat"));
    }
}
