package org.epam;

import java.util.*;

public class Average {
    public double getAverage(int... args) {
        return Arrays.stream(args).boxed().mapToInt(Integer::intValue).average().getAsDouble();
    }
}
