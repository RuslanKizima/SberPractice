public class Task2 {
    public static void QuiqSort(int L, int R, int n, int[] a){
        int i, j, y, x;
        x = a[(L + R)/2];
        i = L;
        j = R;
        do {
            while (a[i] < x) {
                i++;
            }
            while (a[j] > x){
                j--;
            }
            if (i <= j) {
                y = a[i];
                a[i] = a[j];
                a[j] = y;
                i++;
                j--;
            }
        } while (i <= j);
        if (L < j){
            QuiqSort(L, j, n, a);
        }
        if (i < R){
            QuiqSort(i, R, n, a);
        }
    }

    public static void main(String[] arg) {
        int[] a = new int[]{2, 54, 12, 346, 124, 62};
        int i;
        int n = 5;
        int L = 0;
        QuiqSort(L, n, n, a);
        for (i = 0; i <= 5; i++) {
            System.out.print(a[i] + " ");
        }
    }

}



