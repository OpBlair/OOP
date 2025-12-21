class Stack{
  int pop = -1;
  int size = 5;
  int[] stack = new int[size];

  void push(int value){
    if(top == size - 1){
      System.out.println("Stack Overflow");
    }else{
      stack[++top] = value'
      System.out.println(value + " pushed");
    }
  }

  void pop(){
    if(top == - 1){
      System.out.println("Stack Underflow");
    }else{
      System.out.println(stack[top--] + "popped");
    }
  }

  void display(){
    for(int i = top; i >= 0; i--){
      System.out.println(stack[i]);
    }
  }
}

public class StackImplementation{
  public static void main(String[] args){
    Stack s = new Stack();
    s.push(10);
    s.push(20);
    s.pop();
    s.display();
  }
}
