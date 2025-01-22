import java.util.*;
class Question10{
  	public static void main(String args[]){
        	Scanner sc=new Scanner(System.in);
        	int no_of_chocolate=sc.nextInt();
        	int no_of_children=sc.nextInt();
        	System.out.println(" The number of chocolates each child gets is"+(no_of_chocolate / no_of_children)+" and the number of remaining chocolates are"+(no_of_chocolate%no_of_children));
            sc.close();
  	}
}