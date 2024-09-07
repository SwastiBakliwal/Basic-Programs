class OuterClass1 {
    int x = 10;
  
    static class InnerClass1 {
      int y = 5;
    }
  }
  
  class Main1 {
    public static void main(String[] args) {
      OuterClass1.InnerClass1 myInner = new OuterClass1.InnerClass1();
      System.out.println(myInner.y);
    }
  }
  
  // Outputs 5