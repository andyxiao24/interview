package Rabiit;

import com.google.common.collect.Queues;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

/**
 * Created by pengxiao on 2018/7/3.
 * f(1)=10
 f(2)=30
 f(3)=90
 f(4)=270
 f(5)=810
 f(6)=2400
 f(7)=7140
 f(8)=21240
 f(9)=63180
 f(10)=187920
 f(11)=558960
 f(12)=1662600
 f(13)=4945320
 f(14)=14709600
 f(15)=43752960
 f(16)=130140960
 f(17)=387097680
 f(18)=1151402400
 f(19)=3424788000
 f(20)=10186858080
 f(21)=30300292320
 f(22)=90126681600
 f(23)=268077240000
 f(24)=797382144000
 f(25)=2371772715840
 */
public class RabbitMain {
    public static void main(String [] args) {
        for(int i = 1; i <= 30; i++) {
            System.out.println(String.format("f(%d)=%d", i, count(i), count2(i)));
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


    public static Map<Integer, Long> map = new HashMap<Integer, Long>();

    private static long count3(int year) {

        if(year == 1)return 10;
        if(year == 2)return 30;
        if(year == 3)return 90;
        if(year == 4)return 270;
        if(year == 5)return 810;
        if(year == 6)return 2400;

        if(!map.containsKey(year)){

            Long num = (count3(year-1)*3-count3(year-5)*2);
            map.put(year,num);
            return map.get(year);
        }

        return  map.get(year);
    }
}
