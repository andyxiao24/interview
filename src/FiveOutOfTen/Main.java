package FiveOutOfTen;

import static java.util.stream.Collectors.summingInt;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        boolean reses1[] = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, true};
        boolean reses2[] = new boolean[]{false, false, false, true, true, true, true, false};
        boolean reses3[] = new boolean[]{true, true, true, false, false, false, false, false};
        boolean reses4[] = new boolean[]{false, true, false, false, false, true, false, false};
        boolean reses5[] = new boolean[]{false, false, false, true, true, true, true, false};
        boolean reses6[] = new boolean[]{false, false, false, false, true, true, true, true, true, true, false};
        boolean reses7[] = new boolean[]{false, false, false, false, true};

        test(reses1);
        //test(reses2);
        //test(reses3);
        //test(reses4);
        //test(reses5);
        //test(reses6);
        //test(reses7);
    }

    public static void test(boolean reses[]) {
        CheckResult checkResult = new CheckResult();
        for(boolean res : reses) {
            checkResult.checkResult(res);
        }
    }
}
