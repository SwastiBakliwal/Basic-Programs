class OuterClass2 {
    int x = 10;
  
    class InnerClass2 {
      public int myInnerMethod() {
        return x;
      }
    }
  }
  
  class Main3 {
    public static void main(String[] args) {
      OuterClass myOuter = new OuterClass();
      OuterClass2.InnerClass2 myInner = myOuter.new InnerClass2();
      System.out.println(myInner.myInnerMethod());
    }
  }
  
  // Outputs 10