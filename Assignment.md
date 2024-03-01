# Assignment

You will complete each of the methods described below in the `Assignment.java` file. The method headers are already written, you just need to fill them in.

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

This method will return the `int` 2D array with the values filled in.

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