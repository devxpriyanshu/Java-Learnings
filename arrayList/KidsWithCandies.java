package session.arrayList;

import java.util.ArrayList;

public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;

        System.out.println(kidsWithCandies(candies, extraCandies));
    }

    static public ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int max = candies[0];
        for (int i : candies) {
            if (i >= max) {
                max = i;
            }
        }
        for (int i : candies) {
            if (i + extraCandies >= max) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}