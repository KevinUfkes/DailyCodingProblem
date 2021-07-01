package kufkes;

public class ArrayStack {
    private int maxSize;
    private int top;
    private int [] stack;

    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        this.top = -1;
        this.stack = new int [maxSize];
    }

    public boolean push(int val){
        if(top!=maxSize){
            top++;
            stack[top] = val;
            return true;
        }
        return false;
    }

    public int pop(){
        if(top!=-1){
            top--;
            return stack[top+1];
        }
        return -666;
    }


    public int max(){
        int max;
        if(top!=-1){
            max = stack[0];
            for(int x=1; x<=top; x++){
                if(stack[x]>max){
                    max = stack[x];
                }
            }
            return max;
        }
        return -666;
    }
}
