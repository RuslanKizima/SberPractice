public class Task4 {
    public static void main(String[] args){
        int n = 100;
        double[] a = new double[n];
        double min, max, mid;
        int i, k;
        for(i = 0; i < n; i++){
            a[i] = Math.random();
            System.out.print(a[i] + " ");
        }
        System.out.println();
        min = a[0];
        max = a[0];
        mid = 0;

        for(i = 0; i < n; i++){
            if (a[i] > max){
                max = a[i];
            }
            if (a[i] < min){
                min = a[i];
            }
            mid += a[i];
        }
        mid /= n;

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("mid = " + mid);
    }
}
