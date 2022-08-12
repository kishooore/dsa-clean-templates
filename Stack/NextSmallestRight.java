package Stack;

import java.util.Stack;

public class NextSmallestRight {
    Stack<Integer> stack = new Stack<>();
    int[] right;
    
    public NextSmallestRight(int[] heights) {
        stack = new Stack<>();
        right = new int[heights.length];
        for (int i=heights.length - 1; i>=0; i--) {
            if (stack.isEmpty()) {
                right[i] = heights.length;
            } else {
                while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) stack.pop();
                if (stack.isEmpty()) {
                    right[i] = heights.length;
                } else {
                    right[i] = stack.peek();
                }
            }
            stack.push(i);
        }
    }
    
    public int get(int position) {
        return right[position];
    }
}