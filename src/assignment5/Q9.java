package assignment5;

import java.util.ArrayList;
import java.util.Collections;

public class Q9 {
    public static void main(String[] args) {
        int[] num = {15, 22, 14, 26, 32, 9, 16, 8};
        ArrayList<Integer> list = new ArrayList<>();
        list=powerSet(num ,0 ,"0" ,53,list);
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }

    private static ArrayList powerSet(int[] num, int i , String s ,int target,ArrayList list) {
        if(i== num.length){

            int sum = 0;

            ArrayList n = new ArrayList<>();
            for (String retval: s.split(",")) {
                n.add(Integer.parseInt(retval));
                sum = sum + Integer.parseInt(retval);
            }

            if (sum==target){
                n.remove(0);
                Collections.sort(n);
                list.add(n);
            }
            return list;
        }
        powerSet(num , i+1 ,s+ "," + String.valueOf(num[i]) ,target ,list);
        powerSet(num , i+1 ,s ,target,list);
        return list;

    }

}
