import java.util.Scanner;
class Question3{
  	public static void main(String args[]){
       	Scanner sc=new Scanner(System.in);
       	double a=sc.nextDouble();
       	double b=sc.nextDouble();
       	double c=sc.nextDouble();
       	System.out.println("The results of Int Operations are"+(a + b *c) +","+(a * b + c)+","+(c + a / b)+"and "+(a % b + c));
        sc.close();
    }
}