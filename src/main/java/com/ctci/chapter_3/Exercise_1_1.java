package com.ctci.chapter_3;

import com.ctci.ds.LinkedListNode;

import java.util.HashSet;

public class Exercise_1_1 extends Chapter3_Exercise {

    class MultiStack {

        int stackMaxSize;
        int[] sizes;
        int[] values;

        public MultiStack(int stackSize, int stackCount) {
            stackMaxSize = stackSize;
            values = new int[stackSize * stackCount];
            sizes = new int[stackCount];
        }

        public void push(int stack, int value) throws Exception{
            checkStackNumber(stack);
            if (sizes[stack] == stackMaxSize){
                throw new Exception("Stack is full");
            }

            //put element in stack * stackMaxSize + size
            values[stack * stackMaxSize + sizes[stack]] = value;
            sizes[stack]++;
        }

        public int peek(int stack) throws Exception {
            checkStackNumber(stack);
            if (sizes[stack] == 0) return -1;

            return values[stack * stackMaxSize + sizes[stack] - 1];
        }

        public int pop(int stack) throws Exception{
            int res = peek(stack);

            if(sizes[stack] >= 0 ) sizes[stack]--;

            return res;
        }

        private void checkStackNumber(int stack) throws Exception {
            if (stack < 0 || stack > sizes.length)
                throw new Exception("Invalid stack number");
        }
    }

}
