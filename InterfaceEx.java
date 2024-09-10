
    interface In1
    {
        final int a = 10;
        default void display()
        {
            System.out.println("hello");
        }
    }
    
    // A class that implements the interface.
    class TestClass implements In1
    {
        // Driver Code
        public static void main (String[] args)
        {
            TestClass t = new TestClass();
            t.display();
        }
    }    

