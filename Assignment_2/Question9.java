import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fees = sc.nextInt();
        //discount offered 
        int discountPercent = sc.nextInt();
        int discount = fees / discountPercent;
        int amountAfterDiscount = fees - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + amountAfterDiscount
        );
        sc.close();
    }  
}
