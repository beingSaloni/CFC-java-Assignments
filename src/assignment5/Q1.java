package assignment5;

public class Q1 {
    public static void main(String[] args) {
        String s = "abexexdexed";

         move(s ,0  ,"" ,0);



    }
// “abeedeedxxx”
    private static void  move(String s, int i , String st ,int count) {
        if(i==s.length() ){
            for (int j = 0; j <count; j++) {
                st = st + "x";

            }
            System.out.println(st);
            return;
        }
        if(s.charAt(i)=='x'){

            move(s ,i+1  ,st ,count+1);
            return ;

        }
        st =st + s.charAt(i);
        move(s ,i+1 ,st ,count);
        return ;
    }
}