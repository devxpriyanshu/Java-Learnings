package session.arrayList;

import java.util.ArrayList;
import java.util.List;

public class PlusMinus {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(0);
        list.add(-1);
        list.add(-1);
        plusMinus(list);
    }


    public static void plusMinus(List<Integer> arr) {

        int n = arr.size();
        double zero=0,pos=0,neg=0;
        for(int i=0; i<n; i++){
            if(arr.get(i)==0){
                zero++;
            }
            else if(arr.get(i)>0){
                pos++;
            }
            else{
                neg++;
            }
        }
        System.out.println(pos/n);
        System.out.println(neg/n);
        System.out.println(zero/n);

    }

}
