package PalindromeChecker;

public class Stack {
    private CharNode top;
    public Stack(){
        top=null;
    }
    public boolean isEmpty(){
        return top==null;
    }
    public void push(char data){
        CharNode newNode=new CharNode(data);
        newNode.next=top;
        top=newNode;
    }
    public char pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow: Stack is empty");
            return '\0';
        }
        char popped=top.data;
        top=top.next;
        return popped;
    }
    public char peek(){
        if(isEmpty()){
            return '\0';
        }
        return top.data;
    }
}

