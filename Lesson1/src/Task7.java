public class Task7 {
    public static void main(String[] args) {
        int a, b;
        int i;
        int n = 11;
        n -= 2;
        a = 0;
        b = 1;
        System.out.print(a + " " + b + " ");
        for (i = 0; i < n/2; i ++){
            a += b;
            b += a;
            System.out.print(a + " " + b + " ");
        }
    }
}
