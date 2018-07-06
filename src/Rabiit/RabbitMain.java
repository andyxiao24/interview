package Rabiit;

import com.google.common.collect.Queues;

import java.util.Queue;

/**
 * Created by pengxiao on 2018/7/3.
 */
public class RabbitMain {
    public static void main(String [] args) {
        for(int i = 1; i < 25; i++) {
            System.out.println(String.format("f(%d)=%d, %d,", i, count(i), count2(i)));
        }

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

    public static long count2(int n) {
        Queue<Long> longQueue = Queues.newLinkedBlockingQueue(5);
        longQueue.add(10l);
        long sum = 10;
        for (int i = 1; i < n; ++i) {
            long toDie = i >= 5 ? longQueue.poll() : 0;
            long newBorn = (sum - toDie) * 2;
            sum = (sum - toDie) * 3;
            longQueue.add(newBorn);
        }
        return sum;
    }
}
