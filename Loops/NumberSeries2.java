public class NumberSeries2 {
    public static void main(String[] args) {
        int seq = 1;
        int fact;
        int sum;
        
        for (int i = 1; i <= 6; i++) {
            fact = 1;
            sum = 0;
            for (int j = 1; j <= i; j++) {
                fact *= j;
                sum += fact;
            }
            seq = sum;
            System.out.print(seq + " ");
        }
    }
}