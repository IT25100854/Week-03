import java.util.Scanner;
public class StackArray3 {
    char[] arr;
    int top;
    int size;

    //constructor
    public StackArray3(int size) {
        this.size = size;
        arr = new char[size];
        top = -1; //empty
    }

    //push
    public void push(char item) {
        if (isFull()) {
            System.out.println("Stack is Full!");
        } else {
            arr[++top] = item;
        }
    }

    //pop
    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return '0';
        } else {
            return arr[top--];
        }
    }

    //isFull
    public boolean isFull() {
        return size == top + 1;
    }

    //isEmpty
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isBalance(String str) {
        StackArray3 stack = new StackArray3(str.length());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //opening brackets push
            if (ch == '(' || ch == '{' || ch=='[') {
                stack.push(ch);
            }
            //closing brackets
            else if (ch==')' || ch=='}' || ch==']') {
                if (stack.isEmpty()){
                    return false;
                }
                char top= stack.pop();

                //check matching pair
                if((ch==')' && top!='(') ||
                        (ch=='}' && top!='{') ||
                        (ch==']' && top!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
class main{
    public static void main(String[] args) {
        StackArray3 s=new StackArray3(10);
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter an expression with parentheses:");
        String input= sc.nextLine();

        if (s.isBalance(input)){
            System.out.println("he expression has balanced parentheses.");
        }else {
            System.out.println("The expression has imbalanced parentheses.");
        }
    }
}
