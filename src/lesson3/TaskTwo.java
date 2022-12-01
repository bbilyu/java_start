package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskTwo {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<Integer>();
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(8);
        listNumbers.add(6);
        listNumbers.add(1);
        listNumbers.add(3);
        deleteEven(listNumbers);
        System.out.println(listNumbers);
    }

    public static void deleteEven(List<Integer> listOne) {
        Integer[] arrOne = listOne.toArray(new Integer[0]);
        List<Integer> listTwo = new ArrayList<Integer>();

        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] % 2 == 0) {
                listTwo.add(arrOne[i]);
            }
        }
        listOne.removeAll(listTwo);
    }
}
