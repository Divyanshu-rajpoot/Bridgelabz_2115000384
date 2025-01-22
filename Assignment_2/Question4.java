public class Question4 {
    public static void main(String[] args) {
        //cost price 
        int cost_price  = 129;
        //selling price 
        int selling_price = 191;
        //profit = selling price  - cost price
        int profit = selling_price - cost_price;
        //profit percentage
        double profit_percentage = (profit / (double)cost_price) *100;
        System.out.println("The Cost Price is INR " + cost_price + " and Selling Price is INR " + selling_price );
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profit_percentage);
    }
}
