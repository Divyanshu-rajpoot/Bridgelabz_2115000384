public class Question6 {
    public static void main(String[] args) {
        //university Fees
        int fees = 125000;
        //discount offered 
        int discountPercent = 10;
        int discount = fees / discountPercent;
        int amountAfterDiscount = fees - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + amountAfterDiscount
        );
        
    }
}
