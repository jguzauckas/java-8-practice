public class Assignment {
    public static void main(String[] args) {
        Checker.runTests();
    }

    public static void rowSwap(int[][] mat, int rowAIndex, int rowBIndex) {
        for (int i = 0; i < mat[rowAIndex].length; i++) {
            int temp = mat[rowAIndex][i];
            mat[rowAIndex][i] = mat[rowBIndex][i];
            mat[rowBIndex][i] = temp;
        }
    }

    public static void colSwap(int[][] mat, int colAIndex, int colBIndex) {
        for (int i = 0; i < mat.length; i++) {
            int temp = mat[i][colAIndex];
            mat[i][colAIndex] = mat[i][colBIndex];
            mat[i][colBIndex] = temp;
        }
    }

    public static String[][] fillRowMajor(String str, int rows, int cols) {
        String[][] answer = new String[rows][cols];
        int index = 0;
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                if (index < str.length()) {
                    answer[i][j] = str.substring(index, index + 1);
                } else {
                    answer[i][j] = null;
                }
                index++;
            }
        }
        return answer;
    }

    public static int[][] fillColumnMajor(int[] vals, int rows, int cols) {
        int[][] answer = new int[rows][cols];
        int index = 0;
        for (int i = 0; i < answer[0].length; i++) {
            for (int j = 0; j < answer.length; j++) {
                answer[j][i] = vals[index];
                index++;
            }
        }
        return answer;
    }
}