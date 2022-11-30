package lesson2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TaskOne {
    class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int square = 0;
            int max = 0;
            int nextMax = 0;

            if (grid == null || grid.length == 0) return 0;

            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        nextMax = dfs(grid, i, j);
                        max = nextMax > max ? nextMax : max;
                    }
                }
            }

            return max;
        }

        public int dfs(int[][] grid, int i, int j) {
            if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) return 0;
            int sqr = 1;

            grid[i][j] = 0;
            sqr += dfs(grid, i - 1, j);
            sqr += dfs(grid, i - 1, j);
            sqr += dfs(grid, i + 1, j);
            sqr += dfs(grid, i, j - 1);
            sqr += dfs(grid, i, j + 1);

            return sqr;
        }
    }
}
