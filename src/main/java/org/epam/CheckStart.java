package org.epam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckStart {
    private static boolean check(String string) {
        return string.startsWith("a") && string.length() == 3;
    }
    public String[] getStringStartsWith(String ...args) {
        if(args.length == 0) return new String[0];
        return Arrays.stream(args)
                    .filter(CheckStart::check)
                    .toArray(String[]::new);
    }
}
