class MyStack {
    private Queue<Integer> main;
    private Queue<Integer> helper;

    public MyStack() {
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }
    
    public void push(int x) {
        while(main.size()>0) {
            helper.add(main.remove());      //moving elements from main to helper
        }
        main.add(x);                         //add element X in main queue
        while(helper.size()>0) {
            main.add(helper.remove());      //moving elements from helper to main
        }    
    }
    
    public int pop() {
        return main.remove();
    }
    
    public int top() {
        return main.peek();
    }
    
    public boolean empty() {
        if(main.size()==0) {
            return true;
        }
        else {
            return false;
        }
    }
}
