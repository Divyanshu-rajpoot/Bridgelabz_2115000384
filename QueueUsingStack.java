import java.util.Stack;

public class QueueUsingStack {

        static Stack<Integer> stack1 = new Stack<>(); //using for adding 
        static Stack<Integer> stack2 = new Stack<>(); // using for deleting

        public void enqueue(int value){
            System.out.println("The value :- " + value + " Added to the queue");
            stack1.push(value);
            
        }

        public int dequeue(){
            //transfer elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                int value = stack1.pop();
                stack2.push(value);
            }
            //now we have all the elements in stack2 in reverse order now we can delete the first element and display it
            int pop_value = stack2.pop();

            //now putting the values back int the stack1
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
            
            return pop_value;
        }



    //queue operations
    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        //adding the elements in the queue;
        queue.enqueue(10);
        queue.enqueue(12);
        queue.enqueue(14);
        queue.enqueue(16);

        //now we remove the elements
        System.out.println("The Value Removed :- "+ queue.dequeue());
        System.out.println("The Value Removed :- "+ queue.dequeue());
    }
}