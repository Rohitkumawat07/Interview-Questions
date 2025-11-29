 class CountVowels{
    public int countvowels(String s){
        int vowels =0;

        s = s.toLowerCase();

        for(char c : s.toCharArray()){
            if(c == 'a' || c=='e' || c =='i' || c =='o' || c =='u'){
                vowels++;
            }
        }
        return vowels;
    }
    public static void main(String[] args) {
        CountVowels st = new CountVowels();
        System.out.println(st.countvowels("Rohit"));
    }
}