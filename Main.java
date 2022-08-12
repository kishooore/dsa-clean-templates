import Stack.NextSmallestLeft;

class Main {
  public static void main(String[] args) {
    int[] values = {1,2,3,2,1};
    NextSmallestLeft monoStack = new NextSmallestLeft(values);
    int el = monoStack.get(4);
    System.out.println(el);
  }
}