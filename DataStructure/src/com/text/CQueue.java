package com.text;

import java.util.Stack;

class CQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public CQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void appendTail(int value) {
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        stack1.push(value);
    }

    public int deleteHead() {
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        if (stack2.isEmpty()){
            return -1;
        }

        return stack2.pop();


    }
}