package assignment5;

import java.util.ArrayList;

public class Q7 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(countPermutations(s.length()) );
        ArrayList<String> list = new ArrayList<>();
//       list = permutation(list,s,0 );
//
//        for (int i = 0; i < list.size(); i++) {
//            System.out.print("{");
//            System.out.print(list.get(i));
//            System.out.print("}");
//        }
        permutation(s,0);


    }

    private static void permutation(String s, int i) {
        if(s.length()-1 <=i){

            System.out.println(s);

            return;
        }
        for (int k = i; k < s.length(); k++) {
            s= swap( k , i ,s);
            permutation(s , i+1);
            s= swap(i ,k ,s);

        }
    }

    private static ArrayList<String> permutation(ArrayList<String> list, String s, int i) {
        if(i>=s.length()){
            list.add(s);
            return list;
        }

        for (int j = i; j < s.length() ; j++) {
            s = swap(i,j,s);
             permutation(list,s,i +1 );
             s = swap(i,j,s);

        }




        return list;

    }

    private static String swap(int i, int j,String s) {
        char [] arr = s.toCharArray();
        char t = arr[i];
        arr[i] =arr[j];
        arr[j] = t;

        return String.valueOf(arr);
    }

    private static int countPermutations(int n) {
        if(n==1){
            return 1;
        }
       return n*countPermutations(n-1);


    }
}
