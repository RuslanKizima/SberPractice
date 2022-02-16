public class Task5 {
    public static void main(String[] args) {
        int n = 99;
        int[] arr = new int[n];
        int i, j;
        int p;

        for(i = 0; i < n; i++){
            arr[i] = i + 2;
            //System.out.print(arr[i] + " ");
        }

        p = 2;

        for(i = 0; i < n; i++){
            if (arr[i] != 0) {
                p = arr[i];
                for (j = p + i; j < n; j += p) {
                    if (arr[j]%p == 0) {
                        arr[j] = 0;
                    }
                }
            }
        }

        for(i = 0; i < n; i++) {
            if(arr[i] != 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
