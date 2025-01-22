import java.util.Scanner;
class Question4{
  	public static void main(String args[]){
        	Scanner sc=new Scanner(System.in);
        	int celsius=sc.nextInt();
            double fahrenheit = (double)(celsius*9)/5+32;
        	System.out.println("The "+celsius+" celsius is "+ fahrenheit  +"fahrenheit");
            sc.close();
            }
}
