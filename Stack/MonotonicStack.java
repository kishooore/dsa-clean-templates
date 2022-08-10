package Stack;

import java.util.Stack;

/*
Next largest element to the left side implementation using monotonic stack
*/
public class MonotonicStack {
  int[] result;
  Stack<Integer> stack;
  
  public MonotonicStack(int[] values) {
    int N = values.length;
    stack = new Stack<>();
    result = new int[N];

    // to find the right side values loop in reverse order
    for (int i=0; i<N; i++) {
      // to find the smallest elements flip the < to >
      if (stack.isEmpty() || values[stack.peek()] < values[i] ) {
        result[i] = -1;
      } else {
        result[i] = stack.peek();
      }

      // to find the smallest elements flip the < to >
      while (!stack.isEmpty() && values[stack.peek()] < values[i]) {
        stack.pop();
      }

      stack.add(i);
    }
    for (int i=0; i<N; i++) {
      System.out.print(result[i] + ", ");
    }
  }

  public int nextLargestElementLeft(int i) {
    return result[i];
  }
}
