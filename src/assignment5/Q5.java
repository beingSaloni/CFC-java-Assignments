package assignment5;

public class Q5 {
    public static void main(String[] args) {
        String s = "1123";   //aabc, kbc, alc, aaw, kw.
        allPossibleStrings(s,0 ,"");
    }

    private static void allPossibleStrings(String s, int i,String sol) {
        if(i==s.length()){
            System.out.println(sol);
            return;
        }
        String alpha ="0abcdefghijklmnopqrstuvwxyz";


        allPossibleStrings(s ,i+1,sol + alpha.charAt(s.charAt(i)-48));
        if(i< s.length()-1){
            String temp = "" + s.charAt(i) +s.charAt(i+1);

        if(Integer.parseInt(temp) <=26){
            allPossibleStrings(s ,i+2,sol + alpha.charAt(Integer.parseInt(temp)));
        }
    }}
}
