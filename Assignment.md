# Assignment

You will complete each of the methods described below in the `Assignment.java` file. The method headers are already written, you just need to fill them in.

To test your code, you can just run the `Assignment.java` file that you are working in. It will automatically run 1,000 tests with randomly generated 2D arrays and tell you what percentage of tests that you passed for each algorithm. Your goal is to be able to run the `Assignment.java` file and pass 100% of tests for all 8 algorithms.

---

## `rowSwap`

The `rowSwap` method swaps all the values in two rows of a 2D array. The method has three parameters, the 2D `int` array `mat` to do the swapping with, and two `int` values `rowAIndex` and `rowBIndex` specifying the rows whose values should be swapped. Values should maintain the column they were in when they get swapped (i.e. values get their row swapped, but their column stays the same).

This method should edit the `mat` array and not return anything.

Here is a sample of how this method might work:

```
mat (before call):
10  9   8   7
6   5   4   3
2   1   -1  0

rowSwap(mat, 1, 2);

mat (after call):
10  9   8   7
2   1   -1  0
6   5   4   3
```

---

## `colSwap`

The `colSwap` method swaps all the values in two columns of a 2D array. The method has three parameters, the 2D `int` array `mat` to do the swapping with, and two `int` values `colAIndex` and `colBIndex` specifying the rows whose values should be swapped. Values should maintain the column they were in when they get swapped (i.e. values get their row swapped, but their column stays the same).

This method should edit the `mat` array and not return anything.

Here is a sample of how this method might work:

```
mat (before call):
10  9   8   7
6   5   4   3
2   1   -1  0

colSwap(mat, 1, 3);

mat (after call):
10  7   8   9
6   3   4   5
2   0   -1  1
```

---

## `fillRowMajor`

The `fillRowMajor` method takes a `String` and places each of its characters into a 2D `String` array with a defined size. It has three parameters: the `String` `str` to split up into characters, and two `int` values `rows` and `cols` that describe the size of 2D array to be built.

The 2D array is to be filled in row-major order by going through the `String` `str` from beginning to end.

This method will return the `String` 2D array with the characters filled in.

Sometimes the `String` `str` is either too small and can't fill the whole 2D array or is too large and has too many characters to fit into the 2D array:
- If `str` is smaller than the number of characters that can fit in the 2D array, any extra elements in the 2D array are assigned the value `null`.
- If `str` is bigger than the number of characters that can fit in the 2D array, you should only use the characters that can fit (in the order that the `String` is written), and extra characters can be left off.

Here are a few examples of how this method might work:

```
String[][] result = fillRowMajor("stop whining", 3, 4);

result (after method call):
"s"     "t"     "o"     "p"
" "     "w"     "h"     "i"
"n"     "i"     "n"     "g"

String[][] result = fillRowMajor("stop complaining", 3, 4);

result (after method call):
"s"     "t"     "o"     "p"
" "     "c"     "o"     "m"
"p"     "l"     "a"     "i"

String[][] result = fillRowMajor("do more", 3, 4);

result (after method call):
"d"     "o"     " "     "m"
"o"     "r"     "e"     null
null    null    null    null
```

---

## `fillColumnMajor`

The `fillColumnMajor` method takes a 1D `int` array and places each of its characters into a 2D `int` array with a defined size. It has three parameters: the 1D `int` array `vals` to be put into the 2D array, and two `int` values `rows` and `cols` that describe the size of 2D array to be built.

The 2D array is to be filled in column-major order by going through the 1D `int` array `vals` from beginning to end.

This method will return the `int` 2D array with the values filled in. The original 1D `int` array `vals` should remain unchanged.

You can assume that `vals.length == rows * cols`.

Here is an example of how this method might work:

```
int[] source = new int[] {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1};

int[][] result = fillColumnMajor(source, 3, 4);

result (after method call):
10  7   4   1
9   6   3   0
8   5   2   -1
```

---

## `fillDownUp`

The `fillDownUp` method takes a 1D `int` array and places each of its characters into a 2D `int` array with a defined size. It has three parameters: the 1D `int` array `vals` to be put into the 2D array, and two `int` values `rows` and `cols` that describe the size of 2D array to be built.

The 2D array is to be filled in a "down-up" order, which is a modified version of column-major order. The difference from traditional column-major order, is that the cell you are entering "snakes" up and down the columns, as opposed to always filling in the columns from the top to bottom. This means that the first column is filled going downwards, the second column is filled upwards, and we keep alternating back and forth.

This method will return the `int` 2D array with the values filled in. The original 1D `int` array `vals` should remain unchanged.

You can assume that `vals.length == rows * cols`.

Here is an example of how this method might work:

```
int[] source = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

int[][] result = fillDownUp(source, 3, 4);

result (after method call):
1   6   7   12
2   5   8   11
3   4   9   10
```

---

## `grow`

The `grow` method will take a 2D `int` array of values, and create a new larger 2D `int` array with the same values re-filled in. It has three parameters: the 2D `int` array `mat` to be expanded or grown, and two `int` values `newRows` and `newCols` that describe the size of the new, larger, 2D array to be built.

The values from `mat` will be filled into the new larger array in row-major order. This will result in values potentially changing what row and/or column they belong to as the values are stretched to fit the new array. There will be empty values in the new array, they should be left as default `int` values.

This method will return the bigger `int` 2D array with the values filled in. The original 2D `int` array `mat` should remain unchanged.

You can assume that `newRows > mat.length` and `newCols > mat[0].length`.

Here is an example of how this method might work:

```
mat (before method call):
10  9   8   7
6   5   4   3
2   1   -1  0

int[][] result = grow(mat, 4, 5);

result (after method call):
10  9   8   7   6
5   4   3   2   1
-1  0   0   0   0
0   0   0   0   0
```

---

`crop`

The `grow` method will take a 2D `int` array of values, and create a new smaller 2D `int` array with a specified section of the original values filled in. It has three parameters: the 2D `int` array `mat` to be shrunk or cropped, and four `int` values `startRow`, `startCol`, `endRow`, and `endCol` that describe the section of the original 2D array to pull out.

The specified section of values from `mat` will be filled into the new smaller array while maintaining their row/column order. We expect the row and/or column indices to change, but values that were in a row or column together before should remain together in a row or column. There should not be any empty spaces in the new array.

This method will return the smaller `int` 2D array with the values filled in. The original 2D `int` array `mat` should remain unchanged.

Here is an example of how this method might work:

```
mat (before method call):
10  9   8   7
6   5   4   3
2   1   -1  0

int[][] result = crop(mat, 0, 1, 1, 2);

result (after method call):
9   8
5   4
```

---

`invert`

The `invert` method will take a 2D `int` array of values, and perform what is called a "transposition" of the rows and columns. It has one parameters: the 2D `int` array `mat` to be inverted.

A transposition of rows and columns is swapping the rows and the columns of an array. This visually looks like rotating our array 90 degrees to the right, resulting in what used to be the first column being the first row and vice-a-versa with what used to be the first row.

This method will return the transposed `int` 2D array with the values filled in. The original 2D `int` array `mat` should remain unchanged.

Here is an example of how this method might work:

```
mat (before method call);
10  9   8   7
6   5   4   3
2   1   -1  0

int[][] result = invert(mat);

result (after method call):
10  6   2
9   5   1
8   4   -1
7   3   0
```
