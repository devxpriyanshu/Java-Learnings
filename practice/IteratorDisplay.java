package session.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class IteratorDisplay {
    public static void main(String[] args) {

        ArrayList<Integer> aList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            aList.add(x);
        }

        Iterator iterator = aList.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
