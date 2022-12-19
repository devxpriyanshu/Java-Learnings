package session.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrList = new ArrayList<>();

        //initialisation for fixing the list size
        for (int i = 0; i < 3; i++) {
            arrList.add(new ArrayList<>());
        }

        //add Elements
        for (int i = 0; i < arrList.size(); i++) {
            for (int j = 0; j < arrList.size() ; j++) {
                arrList.get(i).add(sc.nextInt());
            }

        }

        System.out.println(arrList);
    }
}
