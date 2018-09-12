package FiveOutOfTen;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//需要实现下面的class，这个函数被调用的最近10次，如果有6次输入的是false，
// 请输出“ERROR!”
public class CheckResult {

    List<Boolean> list =new ArrayList<>();
    int num = 0;
    public void checkResult(boolean result) {
        list.add(result);
        if (result==false){
            num++;
        }
        if (num>=6){
            if (list.size()<=10){
                System.out.println("哈哈");
            }else {
                int count=0;
                for (int j=0;j<list.size()-10;j++){
                    boolean b = list.get(j);
                    if (b==false){
                        count++;
                    }
                    if (num-count>=6){
                        System.out.println("哈哈");
                    }
                }
                num=num-count;
                for (int j=0;j<list.size()-10;j++){
                    list.remove(j);
                }

            }
        }

    }
}
