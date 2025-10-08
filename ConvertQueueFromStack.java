class MyQueue {
    private Stack<Integer> main;
    private Stack<Integer> helper;

    public MyQueue() {
        main = new Stack<>();
        helper = new Stack<>();
        
    }
    
    public void push(int x) {
    //add all elements of main to helper
        while(main.size()>0) {
            helper.push(main.pop());
        }
    //add X element to main
        main.push(x);
    //add all elements of helper to main
         while (helper.size()>0) {
            main.push(helper.pop());
         }
    }
    
    public int pop() {
        return main.pop();
    }
    
    public int peek() {
        return main.peek();
    }
    
    public boolean empty() {
        return main.size()==0;
    }
}
