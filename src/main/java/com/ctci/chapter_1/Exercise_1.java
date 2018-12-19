package com.ctci.chapter_1;

import java.util.HashSet;
import java.util.Set;

public class Exercise_1 extends Chapter1_Exercise {

    public boolean allUniqueCharacters(String str){
        Set set = new HashSet<Character>();
        int idx = 0;
        while (idx < str.length() && !set.contains(str.charAt(idx))){
            set.add(str.charAt(idx));
            idx++;
        }

        return idx == str.length();
    }

    public boolean allUniqueCharacters2(String str){
        Set set = new HashSet<Character>();
        for(char c: str.toCharArray()) {
            set.add(c);
        }

        return set.size() == str.length();
    }
}
