package com.ctci.chapter_3;

import java.util.Stack;

public class Exercise_2 {

    public class Tuple {
        int value, min;

        public Tuple(int value, int min){
            this.value = value;
            this.min = min;
        }
    }

    public class StackWithMin extends Stack<Tuple> {

        public void push(int value) {
            super.push(new Tuple(value, Math.min(min(), value)));
        }

        public int min() {
            if (super.isEmpty())
                return Integer.MAX_VALUE;
            else
                return super.peek().min;
        }

    }

}
