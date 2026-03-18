import java.util.Scanner;
public class StackArray2 {
    char[] arr;
    int top;
    int size;

    //constructor
    public StackArray2(int size){
        this.size=size;
        arr=new char[size];
        top=-1; //empty
    }

    //push
    public void push(char item){
        if (isFull()){
            System.out.println("Stack is Full!");
        }else {
            arr[++top]=item;
        }
    }

    //pop
    public char pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty!");
            return '0';
        }else {
            return arr[top--];
        }
    }

    //isFull
    public boolean isFull(){
        return size==top+1;
    }

    //isEmpty
    public boolean isEmpty(){
        return top==-1;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input= sc.nextLine();

        StackArray2 stack=new StackArray2(input.length());

        //push each character
        for (int i=0;i<input.length();i++){
            stack.push(input.charAt(i));
        }

        //pop to reverse
        System.out.print("Reversed String: ");
        while (!stack.isEmpty()){
            System.out.print(" "+stack.pop());
        }
    }
}