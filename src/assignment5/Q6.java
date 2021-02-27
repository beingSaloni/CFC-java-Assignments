package assignment5;

import java.util.ArrayList;

public class Q6 {
    public static void main(String[] args) {
        String s = "12";
       int c=  count(s,0 ,1);
        System.out.println(c);
        ArrayList<String> list = new ArrayList<>();
//   for 6 ka b..
//      list = permuation(list,s ,0,"");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
        permuation(s ,0,"");
    }

    private static void permuation( String s, int i ,String sol) {
        if(s.length() <=i){

            System.out.println(sol);
            return ;
        }
        String alpha = "0abcdefghijklmnopqrstuvwxyz";
        for (int j = 1; j < 10 ; j++) {
            if(Integer.parseInt(String.valueOf(s.charAt(i)))==j){
                for (int k = j*3-2; k < j*3+1; k++) {
                    permuation(s,i+1,sol + alpha.charAt(k));
                }
            }

        }
        return ;

    }

    private static ArrayList<String> permuation(ArrayList<String> list, String s, int i,String sol) {
        if(s.length() <=i){
            list.add(sol);
            return list;
        }
        String alpha = "0abcdefghijklmnopqrstuvwxyz";
        for (int j = 1; j < 10 ; j++) {
            if(Integer.parseInt(String.valueOf(s.charAt(i)))==j){
                for (int k = j*3-2; k < j*3+1; k++) {
                     permuation(list,s,i+1,sol + alpha.charAt(k));
                }
            }

        }
        return list;
    }

    private static int count(String s,int i , int sol) {
         if(s.length()<=i){
             return sol;
        }
         sol = sol*3;

         return count(s ,i+1,sol);

    }
}
