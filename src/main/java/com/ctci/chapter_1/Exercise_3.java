package com.ctci.chapter_1;

import java.util.Arrays;

public class Exercise_3 extends Chapter1_Exercise {

    public String urlify(char[] str, int len) {

        int spaces = 0;
        for (char c : Arrays.copyOfRange(str, 0, len - 1)) {
            if (c == ' ') spaces++;
        }

        int cur = len - 1;
        int idx = cur + spaces * 2;
        while (idx > 0) {
            if (str[cur] != ' ') { //just copy and move cursors
                str[idx] = str[cur];
                cur--;
                idx--;
            } else { //replace with code
                str[idx] = '0';
                str[idx - 1] = '2';
                str[idx - 2] = '%';
                cur--;
                idx -= 3;
            }
        }

        return String.valueOf(str);
    }

}
