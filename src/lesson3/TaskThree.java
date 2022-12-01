package lesson3;

import java.util.ArrayList;
import java.util.List;

public class TaskThree {
    public static void main(String[] args) {
        List<Integer> listNumbers = new ArrayList<Integer>();
        listNumbers.add(1);
        listNumbers.add(2);
        listNumbers.add(3);
        listNumbers.add(8);
        listNumbers.add(6);
        listNumbers.add(1);
        listNumbers.add(3);

        int maximum = maxValueList(listNumbers);
        int minimum = minValueList(listNumbers);

        System.out.println(String.format("Максимум: %d", maximum));
        System.out.println(String.format("Минимум: %d", minimum));

    }

    public static Integer maxValueList(List<Integer> list) {
        Integer[] arr = list.toArray(new Integer[0]);
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static Integer minValueList(List<Integer> list) {
        Integer[] arr = list.toArray(new Integer[0]);
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }
}
