public class StackArray1 {
    int[] arr;
    int top;
    int size;

    //constructor
    public StackArray1(int size){
        this.size=size;
        arr=new int[size];
        top=-1; //empty
    }

    //push method
    public void push(int item){
        if (isFull()){
            System.out.println("Stack is Full!");
        }else {
            arr[++top]=item;
        }
    }

    //pop
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }else {
            return arr[top--];
        }
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
            return -1;
        }else {
            return arr[top];
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

    //display
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty!");
        }else {
            System.out.print("Stack elements: ");
            for (int i=0;i<=top;i++){
                System.out.print(" "+arr[i]);
            }
        }
    }
}
class Main {
    public static void main(String[] args) {
        StackArray1 stack=new StackArray1(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println();
        System.out.println("Peek: "+stack.peek());
        System.out.println("Popped: "+stack.pop());

        stack.display();

        System.out.println();
        System.out.println("Is stack empty? "+stack.isEmpty());
        System.out.println("Is stack full? "+stack.isFull());
    }
}
