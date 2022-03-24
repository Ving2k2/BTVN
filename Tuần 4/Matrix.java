import java.util.Scanner;

public class Matrix {
    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; ++row) {
            for (int col = 0; col < matrix[0].length; ++ col) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static void print(double[][] matrix) {
        for (int row = 0; row < matrix.length; ++row) {
            for (int col = 0; col < matrix[0].length; ++ col) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println("");
        }
        System.out.println();
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2)  {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2)  {
        return matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (haveSameDimension(matrix1,matrix2)) {
            int[][] matrixAdded = new int[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrixAdded.length; ++row) {
                for (int col = 0; col < matrixAdded[0].length; ++ col) {
                    matrixAdded[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
            return matrixAdded;
        } else {
            return null;
        }
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (haveSameDimension(matrix1,matrix2)) {
            double[][] matrixAdded = new double[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrixAdded.length; ++row) {
                for (int col = 0; col < matrixAdded[0].length; ++ col) {
                    matrixAdded[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
            return matrixAdded;
        } else {
            return null;
        }
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (haveSameDimension(matrix1,matrix2)) {
            int[][] matrixAdded = new int[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrixAdded.length; ++row) {
                for (int col = 0; col < matrixAdded[0].length; ++ col) {
                    matrixAdded[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
            return matrixAdded;
        } else {
            return null;
        }
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (haveSameDimension(matrix1,matrix2)) {
            double[][] matrixAdded = new double[matrix1.length][matrix1[0].length];
            for (int row = 0; row < matrixAdded.length; ++row) {
                for (int col = 0; col < matrixAdded[0].length; ++ col) {
                    matrixAdded[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
            return matrixAdded;
        } else {
            return null;
        }
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
         if (matrix1[0].length == matrix2.length) {
             int num = 0;
             int idx = 0;
             int[] multiArray = new int[matrix1[0].length * matrix2.length];
             int[][] multiMatrix = new int[matrix1.length][matrix2[0].length];

             for (int row = 0; row < matrix1.length; ++row) {
                 for (int i = 0; i < matrix2[0].length; ++i) {
                     for (int col = 0; col < matrix1[0].length; ++col) {
                         num += matrix1[row][col] * matrix2[col][i];
                     }
                     multiArray[idx] = num;
                     num = 0;
                     idx++;
                 }
             }

             for (int row = 0; row < matrix1.length; ++row) {
                 for (int col = 0; col < matrix2[0].length; ++col) {
                     multiMatrix[row][col] = multiArray[row + col];
                 }
             }
             return multiMatrix;
         } else {
             return null;
         }
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        if (matrix1[0].length == matrix2.length) {
            int num = 0;
            int idx = 0;
            double[] multiArray = new double[matrix1[0].length * matrix2.length];
            double[][] multiMatrix = new double[matrix1.length][matrix2[0].length];

            for (int row = 0; row < matrix1.length; ++row) {
                for (int i = 0; i < matrix2[0].length; ++i) {
                    for (int col = 0; col < matrix1[0].length; ++col) {
                        num += matrix1[row][col] * matrix2[col][i];
                    }
                    multiArray[idx] = num;
                    num = 0;
                    idx++;
                }
            }

            for (int row = 0; row < matrix1.length; ++row) {
                for (int col = 0; col < matrix2[0].length; ++col) {
                    multiMatrix[row][col] = multiArray[row + col];
                }
            }
            return multiMatrix;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the row of matrix 1: ");
        int inRow1 = scanner.nextInt();

        System.out.print("Enter the column of matrix 1: ");
        int inColumn1 = scanner.nextInt();

        int[][] matrix1 = new int[inRow1][inColumn1];
        System.out.println("Enter the number in matrix 1: ");
        for (int row = 0; row < inRow1; ++row) {
            for (int col = 0; col < inColumn1; ++ col) {
                matrix1[row][col] = scanner.nextInt();
            }
        }
        
        System.out.print("Enter the row of matrix 2: ");
        int inRow2 = scanner.nextInt();

        System.out.print("Enter the column of matrix 2: ");
        int inColumn2 = scanner.nextInt();
        
        int[][] matrix2 = new int[inRow2][inColumn2];
        System.out.println("Enter the number in matrix 2: ");
        for (int row = 0; row < inRow2; ++row) {
            for (int col = 0; col < inColumn2; ++ col) {
                matrix2[row][col] = scanner.nextInt();
            }
        }
   
        scanner.close();
 
        print(matrix1);
        print(matrix2);
        print(add(matrix1,matrix2));
        print(subtract(matrix1,matrix2));
        print(multiply(matrix1,matrix2));

    }
}
