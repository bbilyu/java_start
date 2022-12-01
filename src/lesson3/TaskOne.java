package lesson3;

import java.util.ArrayList;
import java.util.List;

public class TaskOne {
    public static void main(String[] args) {
        String equation = " 2? + ?5 = 69".replace(" ", "");

        char[] CharArrays = equation.toCharArray();
        List<Integer> indexx = new ArrayList<>();

        for (int i = 0; i < CharArrays.length; i++) {
            if (CharArrays[i] == '?') {
                indexx.add(i);
            }
        }

        Integer[] indexes = indexx.toArray(new Integer[0]);
        List variables = new TaskOne().combine(indexes.length, CharArrays, indexes);
        if (variables.toArray().length == 0) {
            System.out.println("Нету решений");
        } else System.out.println(variables);


    }

    List<List<Integer>> ans;

    public List<List<Integer>> combine(int k, char[] CharArr, Integer[] indx) {
        ans = new ArrayList<>();
        helper(new ArrayList<>(), k, CharArr, indx);

        return ans;
    }

    public void helper(List<Integer> comb, int k, char[] CharArrr, Integer[] indexx) {
        if (comb.size() == k) {
            Integer[] combArr = comb.toArray(new Integer[0]);
            CharArrr[indexx[0]] = Character.forDigit(combArr[0], 10);
            CharArrr[indexx[1]] = Character.forDigit(combArr[1], 10);

            for (int i = 0; i < CharArrr.length; i++) {
                if (CharArrr[i] == '+') {
                    CharArrr[i] = '=';
                }
            }
            String equationElement = new String(CharArrr);
            String[] equationPart = equationElement.split("=");
            int a = Integer.parseInt(equationPart[0]);
            int b = Integer.parseInt(equationPart[1]);
            int c = Integer.parseInt(equationPart[2]);
            if (a + b == c) {
                ans.add(new ArrayList(comb));
            }

            return;
        }

        for (int i = 0; i <= 9; i++) {

            comb.add(i);
            helper(comb, k, CharArrr, indexx);
            comb.remove(comb.size() - 1);
        }
    }

}