package Stack;

import java.util.Stack;

/*
Next largest element to the left side implementation using monotonic stack
*/
public class NextSmallestLeft {
  int[] result;
  Stack<Integer> stack;
  
  public NextSmallestLeft(int[] values) {
    int N = values.length;
    stack = new Stack<>();
    result = new int[N];

    for (int i=0; i<N; i++) {
      if (stack.isEmpty()) {
        result[i] = -1;
      } else {
        // balance the the stack before taking the answer
        while (!stack.isEmpty() && values[stack.peek()] >= values[i]) {
          stack.pop();
        }
        // take the answer
        if (stack.isEmpty()) {
          result[i] = -1;
        } else {
          result[i] = stack.peek();
        }
      }
      // unbalance the stack for next iteration
      stack.add(i);
    }
  }

  public int get(int pos) {
    return result[pos];
  }
}
