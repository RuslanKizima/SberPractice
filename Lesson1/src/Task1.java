public class Task1 {
    public static void main(String[] args){
        int[] a = new int[]{2, 54, 12, 346, 124, 62};
        int n = 5;
        int i, j, k;
        for(i = 1; i <= n; i++){
            for(j = n; j >= i; j--){
                if (a[j-1] > a[j]){
                    k = a[j];
                    a[j] = a[j-1];
                    a[j-1] = k;
                }
            }
        }
        for(i = 0; i <= n; i++){
            System.out.print(a[i]);
            System.out.print(' ');
        }
    }
}


