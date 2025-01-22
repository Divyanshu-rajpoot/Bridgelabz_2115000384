import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double quantity = sc.nextDouble();
        double unitprice = sc.nextDouble();
        System.out.println("The Total purchase price is " + quantity * unitprice + " if the quantity " + quantity +" and unit price is INR " + unitprice);
        sc.close();
    }
}
