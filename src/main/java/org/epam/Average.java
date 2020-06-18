package org.epam;

import java.util.*;

public class Average {
    public float getAverage(int ...args) {
        if(args.length == 0) return 0.0f;
        int sum = Arrays.stream(args)
                .boxed()
                .mapToInt(Integer::intValue)
                .sum();
        int listSize = args.length;
        return (float) sum/listSize;
    }
}
