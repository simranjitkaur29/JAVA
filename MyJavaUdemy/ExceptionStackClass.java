class StackOverFlow extends Exception{
    public String toString(){
        return "Stack is full";
    }


}
class StackUnderFlow extends Exception{
    public String toString(){
        return "Stack is empty";
    }

}class Stack{
    private int size;
    private int top=-1;
    private int S[];
    public Stack(int sz)
    {
        size =sz;
        S=new int[sz];
    }
    public void push(int x) throws StackOverFlow{
        if(top==size-1){
            throw new StackOverFlow();}
        top++;
            S[top]=x;
        }
        public int pop() throws StackUnderFlow{
            int x=-1;
            if(top==-1){
                throw new StackUnderFlow();
            }
            else{
                top--;
                return x;
            }
        }
    }
    public  class ExceptionStackClass {
    public static void main(String args[]) {
        Stack s=new Stack(5);
        try 
        {
            s.push(78);
        s.push(7);
        s.push(5);
        s.push(6);
        s.push(5);
        
        s.pop();
        s.pop();
        s.pop();
        
        s.pop();
       s.pop();
        
        
        



        }
        catch(StackOverFlow st){
            System.out.println(st);
        }
        catch(StackUnderFlow st){
            System.out.println(st);
        }

    }
}
