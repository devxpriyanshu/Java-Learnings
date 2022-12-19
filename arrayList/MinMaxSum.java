package session.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class MinMaxSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(1);
        miniMaxSum(list);
    }
    public static void miniMaxSum(ArrayList<Integer> arr) {
        int n = arr.size();
        long minSum=0,maxSum=0;
        int[] array = new int[n];
        for (int i = 0; i<n ; i++) {
            array[i] = arr.get(i);
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < n ; i++) {
            if(i!=0){
                maxSum += array[i];
            }
            if(i!=n-1){
                minSum += array[i];
            }
        }
        System.out.println(minSum+" "+maxSum);
    }

}
