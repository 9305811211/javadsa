import java.util.*;

class stack {
    int arr[];
    int top,capacity;
    stack(int size) {
      arr = new int[size];
      capacity = size;
      top = -1;
    }
    public void push(int x) {
      if (top==capacity-1) {
        System.out.println("Stack OverFlow");
        return;
      }
  
    
      System.out.println("Inserting " + x);
      arr[++top] = x;
    }
  
    
    public int pop() {
      if (top==-1) {
        System.out.println("Stack UnderFlow");
        System.exit(1);
      }
      System.out.println("Removing "+arr[top]);
      return arr[top--];
    }
    public void printStack() {
      for (int i = 0; i <= top; i++) {
        System.out.print(arr[i] + ", ");
      }
    }
  
    public static void main(String[] args) {
      int s,sw;
      char c;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of stack");
      s=sc.nextInt();
      stack st = new stack(s);
      System.out.println("Enter 'Y' if you want to do some stack operations or 'N' if you want to stop");
      c=sc.next().charAt(0);
      while(c=='Y'){
      System.out.println("Enter 1 to push into the Stack\n Enter 2 to pop from the stack\n Enter 3 to display the stack");
      sw=sc.nextInt();
      switch(sw){
        case 1:
        System.out.println("Enter the integer to push");
        int i=sc.nextInt();
        st.push(i);
        break;

        case 2:
        st.pop();
        break;

        case 3:
        System.out.println("Stack:");
        st.printStack();
        break;

        default:
        System.out.println("Wrong Choice");
      }
      System.out.println("\nEnter 'Y' if you want to do some stack operations or 'N' if you want to stop");
      c=sc.next().charAt(0);
      }
      sc.close();
    }
  }