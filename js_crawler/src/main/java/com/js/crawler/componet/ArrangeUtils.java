package com.js.crawler.componet;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Show on 2017/6/1.
 */
public class ArrangeUtils {
    /**
     *
     * @param startIndex 起始值
     * @param denominator  總數：包含(起始值和終止值)
     * @param numerator  除數
     * @exception RuntimeException  總數除以除數必須整除。
     * @return List<TargetRange>
     */
    public static List<TargetRange> arrageTarget(int startIndex, int denominator, int numerator) {
        List<TargetRange> targetRangeList=new ArrayList<TargetRange>();
        int quotient = denominator / numerator;
        int remainder = denominator % numerator;
        if(remainder!=0)
            throw new RuntimeException("被除數(denominator)除以除數(numerator)必須整除。");
        TargetRange targetRange;
        int start,end;
        for (int i = 0; i <numerator ; i++) {
            start = i * quotient+startIndex;
            if(i==numerator-1)
                end = quotient * (i + 1 )+ remainder+startIndex-1;
            else
                end = quotient *( i + 1)+startIndex-1;
            targetRange = new TargetRange(start,end);
            targetRangeList.add(targetRange);
            System.out.println(targetRange.toString());
        }
        return targetRangeList;
    }
}
