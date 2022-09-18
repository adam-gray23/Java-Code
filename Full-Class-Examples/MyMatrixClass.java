public class MyMatrixClass {
    public static void main(String[] args) {
        int[][] myMatrix1 = new int[2][3];
        int[][] myMatrix2 = new int[3][2];
        //call the function to fill the matrix1
        MatrixMaker.fillMatrix(myMatrix1);
        //call print function
        MatrixMaker.printMatrix(myMatrix1);
        System.out.println();

        //call the function to fill the matrix2
        MatrixMaker.fillMatrix(myMatrix2);
        //call print function
        MatrixMaker.printMatrix(myMatrix2);
        System.out.println();

        //call the function to multiply the two matrices
        int[][] result = Multiply.multiply(myMatrix1, myMatrix2);
        //print the result
        MatrixMaker.printMatrix(result);
    }
}

class MatrixMaker {
    //fill up matrix function
    public static void fillMatrix(int[][] matrix) {
        //for every row
        for (int i = 0; i < matrix.length; i++) {
            //for every column
            for (int j = 0; j < matrix[i].length; j++) {
                //going to fiil with a random number from 0-9
                //(int) -- specify that you want an integer (usuing float would be  float)
                //Math.random() -- returns a random number from 0-1
                // * 10 -- multiply by 10 to get a number from 0-9
                matrix[i][j] = (int)(Math.random() * 10);
            }
        }
    }

    //print matrix
    public static void printMatrix(int[][] m) {
        //for every row
        for (int i = 0; i < m.length; i++) {
            //for every column
            for (int j = 0; j < m[i].length; j++) {
                //print out the number and a space
                System.out.print(m[i][j] + " ");
            }
            //print a new line after each row
            System.out.println();
        }
    }
}

class Multiply{
    public static int[][] multiply(int[][] m1, int[][] m2){
        //create a new matrix to hold the result
        int[][] m3 = new int[m1.length][m2[0].length];
        //for every row in m1
        for (int i = 0; i < m1.length; i++){
            //for every column in m2
            for (int j = 0; j < m2[0].length; j++){
                //for every column in m1
                for (int k = 0; k < m1[0].length; k++){
                    m3[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return m3;
    }
}