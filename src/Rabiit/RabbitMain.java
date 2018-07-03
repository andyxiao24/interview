package Rabiit;

/**
 * Created by pengxiao on 2018/7/3.
 */
public class RabbitMain {
    public static void main(String [] args) {
        System.out.println(count(10));
    }

    public static long count(int n) {
        long tmp[] = new long[] {10,0,0,0,0};
        long sum = 0;
        for(int i = 1; i < n; ++i) {
            sum = 0;
            for (int j = tmp.length - 1; j > 0; --j) {
                tmp[j] = tmp[j-1];
                sum += tmp[j - 1];
            }
            tmp[0] = sum * 2;
        }
        return sum * 3;
    }
}
