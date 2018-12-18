package main.java.chapter_1;

public class Exercise_5 {

    public boolean areStringsOneEditDistanced(String a, String b) {


        if (a.length() == b.length() + 1)
            return checkOneRemoval(a, b);
        else if (a.length() + 1 == b.length())
            return checkOneRemoval(b, a);
        else if (a.length() == b.length())
            return checkOneReplace(a, b);
        else return false;
    }

    boolean checkOneRemoval(String l, String s) {
        int lidx = 0;
        int sidx= 0;

        while (sidx < s.length() && l.charAt(lidx) == s.charAt(sidx)) {
            lidx += 1;
            sidx += 1;
        }
        if (sidx < s.length()){
            lidx++;
            while (sidx < s.length() && l.charAt(lidx) == s.charAt(sidx)) {
                lidx++; sidx++;
            }
        }

        return lidx == l.length() && sidx == s.length();
    }

    boolean checkOneReplace(String a, String b) {
        int diff = 0;
        for (int idx = 0; idx < a.length(); idx++) {
            if (a.charAt(idx) != b.charAt(idx))
                diff++;
        }

        return diff <= 1;
    }
}