package main.java.chapter_1;

public class Exercise_6 {

    public String compress(String str) {
        StringBuilder builder = new StringBuilder();
        int count = 0;
        char c = '-';
        for (int idx = 1; idx < str.length(); idx++) {
            count++;
            c = str.charAt(idx);
            if (c != str.charAt(idx - 1)) {
                builder.append(str.charAt(idx - 1));
                builder.append(count);
                count = 0;
            }
        }
        builder.append(c);
        builder.append(count + 1);

        return str.length() < builder.length() ? str : builder.toString();
    }
}
