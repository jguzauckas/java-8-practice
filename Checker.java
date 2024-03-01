public class Checker {
    public static void runTests() {
        int numTests = 100;
        runRowSwapTests(numTests);
        runColSwapTests(numTests);
        runFillRowMajorTests(numTests);
        runFillColumnMajorTests(numTests);
    }

    public static void runRowSwapTests(int numTests) {
        int passCount = 0;
        boolean pass = true;
        for (int i = 0; i < numTests; i++) {
            int[][] test = new int[(int) (Math.random() * 20 + 1)][(int) (Math.random() * 20 + 1)];
            int[][] result = new int[test.length][test[0].length];
            for (int j = 0; j < test.length; j++) {
                for (int k = 0; k < test[j].length; k++) {
                    test[j][k] = (int) (Math.random() * 200 - 100);
                    result[j][k] = test[j][k];
                }
            }
            int randomRowA = (int) (Math.random() * test.length);
            int randomRowB = (int) (Math.random() * test.length);
            Assignment.rowSwap(result, randomRowA, randomRowB);
            if (rowSwapTest(test, result, randomRowA, randomRowB)) {
                passCount++;
            } else {
                pass = false;
            }
        }
        System.out.println("rowSwap Method Testing:");
        if (pass) {
            System.out.println("Congratulations, you passed all " + numTests + " tests!");
        } else {
            System.out.println("Unfortunately, you did not pass all " + numTests + " tests");
            System.out.println("You passed " + passCount + " of the " + numTests + " tests, which is " + (100 * ((double) passCount / numTests)) + "% of tests.");
        }
        System.out.println();
    }

    public static boolean rowSwapTest(int[][] matA, int[][] matB, int rowAIndex, int rowBIndex) {
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                if (i == rowAIndex) {
                    if (matA[i][j] != matB[rowBIndex][j]) {
                        return false;
                    }
                } else if (i == rowBIndex) {
                    if (matA[i][j] != matB[rowAIndex][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void runColSwapTests(int numTests) {
        int passCount = 0;
        boolean pass = true;
        for (int i = 0; i < numTests; i++) {
            int[][] test = new int[(int) (Math.random() * 20 + 1)][(int) (Math.random() * 20 + 1)];
            int[][] result = new int[test.length][test[0].length];
            for (int j = 0; j < test.length; j++) {
                for (int k = 0; k < test[j].length; k++) {
                    test[j][k] = (int) (Math.random() * 200 - 100);
                    result[j][k] = test[j][k];
                }
            }
            int randomColA = (int) (Math.random() * test[0].length);
            int randomColB = (int) (Math.random() * test[0].length);
            Assignment.colSwap(result, randomColA, randomColB);
            if (colSwapTest(test, result, randomColA, randomColB)) {
                passCount++;
            } else {
                pass = false;
            }
        }
        System.out.println("colSwap Method Testing:");
        if (pass) {
            System.out.println("Congratulations, you passed all " + numTests + " tests!");
        } else {
            System.out.println("Unfortunately, you did not pass all " + numTests + " tests");
            System.out.println("You passed " + passCount + " of the " + numTests + " tests, which is " + (100 * ((double) passCount / numTests)) + "% of tests.");
        }
        System.out.println();
    }

    public static boolean colSwapTest(int[][] matA, int[][] matB, int colAIndex, int colBIndex) {
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[i].length; j++) {
                if (j == colAIndex) {
                    if (matA[i][j] != matB[i][colBIndex]) {
                        return false;
                    }
                } else if (j == colBIndex) {
                    if (matA[i][j] != matB[i][colAIndex]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void runFillRowMajorTests(int numTests) {
        int passCount = 0;
        boolean pass = true;
        for (int i = 0; i < numTests; i++) {
            int strLength = (int) (Math.random() * 1000);
            String str = "";
            for (int j = 0; j < strLength; j++) {
                str += Character.toString((char) ((int) (Math.random() * 26 + 97)));
            }
            int randomRows = (int) (Math.random() * 2 * Math.sqrt(strLength) + 1);
            int randomCols = (int) (Math.random() * 2 * Math.sqrt(strLength) + 1);
            String[][] answer = Assignment.fillRowMajor(str, randomRows, randomCols);
            if (fillRowMajorTest(str, answer, randomRows, randomCols)) {
                passCount++;
            } else {
                pass = false;
            }
        }
        System.out.println("fillRowMajor Method Testing:");
        if (pass) {
            System.out.println("Congratulations, you passed all " + numTests + " tests!");
        } else {
            System.out.println("Unfortunately, you did not pass all " + numTests + " tests");
            System.out.println("You passed " + passCount + " of the " + numTests + " tests, which is " + (100 * ((double) passCount / numTests)) + "% of tests.");
        }
        System.out.println();
    }

    public static boolean fillRowMajorTest(String str, String[][] mat, int rows, int cols) {
        if (mat.length != rows || mat[0].length != cols) {
            return false;
        }
        int index = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (index < str.length()) {
                    if (!mat[i][j].equals(str.substring(index, index + 1))) {
                        return false;
                    }
                } else {
                    if (mat[i][j] != null) {
                        return false;
                    }
                }
                index++;
            }
        }
        return true;
    }

    public static void runFillColumnMajorTests(int numTests) {
        int passCount = 0;
        boolean pass = true;
        for (int i = 0; i < numTests; i++) {
            int randomRows = (int) (Math.random() * 2 * Math.sqrt(1000) + 1);
            int randomCols = (int) (Math.random() * 2 * Math.sqrt(1000) + 1);
            int[] vals = new int[randomRows * randomCols];
            for (int j = 0; j < vals.length; j++) {
                vals[j] = (int) (Math.random() * 200 - 100);
            }
            int[][] answer = Assignment.fillColumnMajor(vals, randomRows, randomCols);
            if (fillColumnMajorTest(vals, answer, randomRows, randomCols)) {
                passCount++;
            } else {
                pass = false;
            }
        }
        System.out.println("fillColumnMajor Method Testing:");
        if (pass) {
            System.out.println("Congratulations, you passed all " + numTests + " tests!");
        } else {
            System.out.println("Unfortunately, you did not pass all " + numTests + " tests");
            System.out.println("You passed " + passCount + " of the " + numTests + " tests, which is " + (100 * ((double) passCount / numTests)) + "% of tests.");
        }
        System.out.println();
    }

    public static boolean fillColumnMajorTest(int[] vals, int[][] mat, int rows, int cols) {
        if (mat.length != rows || mat[0].length != cols) {
            return false;
        }
        int index = 0;
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] != vals[index]) {
                    return false;
                }
                index++;
            }
        }
        return true;
    }
}
