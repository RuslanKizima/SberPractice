public class Matrix {
    private int n, m;
    private double[][] matrix = new double[n][m];

    public double[][] sumMatrix(double[][] Matrix1, int n1, int m1, double[][] Matrix2, int n2, int m2, double[][] sum){
        if (n1 == n2 && m1 == m2) {
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    sum[i][j] = Matrix1[i][j] + Matrix2[i][j];
                }
            }
        }
        else{
            System.out.println("Нельзя суммировать матрицы разных размеров.");
        }
        return sum;
    }

    public void printMatrix(double[][] Matrix){
        for (int i = 0; i < Matrix.length; i++){
            for (int j = 0; j < Matrix[i].length; j++){
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public double[][] multiNumMatrix(double[][] Matrix, int n, int m, double number){
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                Matrix[i][j] *= number;
            }
        }
        return Matrix;
    }

    public double[][] multi2matrix(double[][] Matrix1, int n1, int m1, double[][] Matrix2, int n2, int m2, double[][] mult){
        if (m1 == n2){
            for (int i = 0; i < m1; i++){
                for (int j = 0; j < n2; j++){
                    for (int k = 0; k < m2; k++){
                        mult[i][j] += Matrix1[i][k]*Matrix2[k][j];
                    }
                }
            }
        }
        else{
            System.out.println("Умножение матриц невозможно, потому что кол-во столбцов 1 матрицы отлично");
            System.out.println("oт количества строк 2 матрицы");
        }

        return mult;
    }

}
