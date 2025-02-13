
import java.util.Stack;

public class SortStackRecusion {

    public static void sortInsert(Stack<Integer> s , int value){

        if(s.isEmpty() || value > s.peek()){
            s.push(value);
            return;
        }

        //if the element is greater than the top value
        int x = s.pop();
        sortInsert(s, value);
    
        s.push(x);

    }


    //main fucntion to sort the stack
    public static void SortStack(Stack<Integer> s){
        //firstly just remove the elements such that each recursion call has a element with it (Frame)
        if (!s.isEmpty()) {
            //pop every element
           int pop = s.pop();

        //get it a frame
            SortStack(s);
            sortInsert(s, pop);
        }

    }
    
    public static void main(String[] args) {
        Stack<Integer> stack  = new Stack<>();
        //add the elements in the stack 
        stack.push(10);
        stack.push(8);
        stack.push(18);
        stack.push(1);
        stack.push(29);
        System.out.println(stack);

        //after sorting
        SortStack(stack);
        

        //after sorting
        System.out.println(stack);
    }
}
