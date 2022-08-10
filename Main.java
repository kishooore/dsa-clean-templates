import Stack.MonotonicStack;

class Main {
  public static void main(String[] args) {
    int[] values = {1,2,3,2,1};
    MonotonicStack monoStack = new MonotonicStack(values);
    int el = monoStack.nextLargestElementLeft(4);
    System.out.println("answer: " + el);
  }
}