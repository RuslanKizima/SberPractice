public class MatrixDriver {
    public static void main(String[] args){
        int n1 = 3, m1 = 3, n2 = 2, m2 = 3;
        Matrix matrix = new Matrix();
        double[][] sum = new double[n1][m1];
        double[][] mult = new double[m1][n2];
        double[][] mat1 = new double[n1][m1];
        double[][] mat2 = new double[n2][m2];

        for (int i = 0; i < n1; i++){
            for (int j = 0; j < m1; j++){
                mat1[i][j] = Math.round(Math.random()*6);
            }
        }
        for (int i = 0; i < n2; i++){
            for (int j = 0; j < m2; j++){
                mat2[i][j] = Math.round(Math.random()*6);
            }
        }
        matrix.printMatrix(mat1);
        matrix.printMatrix(mat2);
        System.out.println();
        sum = matrix.sumMatrix(mat1,n1, m1, mat2, n2, m2, sum);
        matrix.printMatrix(sum);
        System.out.println();

        mult = matrix.multi2matrix(mat1, n1, m1, mat2, n2, m2, mult);
        matrix.printMatrix(mult);
        System.out.println();

        mat1 = matrix.multiNumMatrix(mat1, n1, m1, 12);
        matrix.printMatrix(mat1);

    }

}
