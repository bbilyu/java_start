package lesson4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class TaskOne {
    public static void main(String[] args) {
        int[][] mat = {{0, 1, 1}, {1, 1, 1}, {0, 1, 1}};

        System.out.println(Arrays.deepToString(mat).replace("], ", "]\n"));
        updateMatrix(mat);
        System.out.println("-----------------------");
        System.out.println(Arrays.deepToString(mat).replace("], ", "]\n"));
    }

    static final int GATE = 0;
    static final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};


    public static int[][] updateMatrix(int[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        int steps = 0;

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[0].length; col++) {
                if (mat[row][col] == GATE) {
                    q.add(new int[]{row, col});
                } else {
                    mat[row][col] = -1;
                }
            }
        }

        while (!q.isEmpty()) {
            int size = q.size();
            steps++;

            while (size > 0) {

                int[] curPoint = q.poll();
                int curRow = curPoint[0];
                int curCol = curPoint[1];

                for (int[] direction : DIRECTIONS) {
                    int newRow = curRow + direction[0];
                    int newCol = curCol + direction[1];
                    if (newRow < 0 || newCol < 0 || newRow >= mat.length || newCol >= mat[0].length || mat[newRow][newCol] != -1) {
                        continue;
                    }
                    mat[newRow][newCol] = steps;
                    q.add(new int[]{newRow, newCol});
                }
                size--;
            }
        }
        return mat;
    }
}