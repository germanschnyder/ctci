package com.ctci.chapter_1;

public class Exercise_4 extends Chapter1_Exercise {

    public boolean isPermutationOfAPalindrom(String str) {

        int[] freq = new int[27];

        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }

        boolean oddFound = false;
        int idx;
        for (idx = 0; idx < freq.length; idx++) {
            if (freq[idx] % 2 == 1) {
                if (oddFound) break;
                else oddFound = true;
            }

        }

        return idx == freq.length;
    }
}