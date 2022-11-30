package lesson2;

public class TaskTwo {
    class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            if (image[sr][sc] == color) return image;
            changeColor(image, sr, sc, image[sr][sc], color);

            return image;
        }

        public void changeColor(int[][] image, int sr, int sc, int colorStrart, int newColor) {

            if (sr < 0 || sc < 0 || sr >= image.length || sc >= image[0].length || image[sr][sc] != colorStrart) return;

            image[sr][sc] = newColor;
            changeColor(image, sr - 1, sc, colorStrart, newColor);
            changeColor(image, sr + 1, sc, colorStrart, newColor);
            changeColor(image, sr, sc - 1, colorStrart, newColor);
            changeColor(image, sr, sc + 1, colorStrart, newColor);
        }
    }
}
