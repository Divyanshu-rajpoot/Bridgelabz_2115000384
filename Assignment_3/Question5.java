import java.util.Scanner;
class Question5{
  	public static void main(String args[]){
        	Scanner sc=new Scanner(System.in);
        	int fahrenheit =sc.nextInt(); 
           double celsius = (double)((fahrenheit-32)*5)/9;
        	System.out.println("The "+ fahrenheit +" fahrenheit is "+celsius +"celsius");
            sc.close();
        }
}
