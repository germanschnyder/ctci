package com.ctci.chapter_1;

public class Exercise_2 extends Chapter1_Exercise {

    public boolean isPermutation(String sampleA, String sampleB) {
        int[] freq = new int[27];

        for (char c : sampleA.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c : sampleB.toCharArray()) {
            freq[c - 'a']--;
        }

        boolean result = true;
        for (int i : freq)
            result &= i == 0;

        return result;
    }
}
