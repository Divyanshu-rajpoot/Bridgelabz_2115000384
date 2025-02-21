import java.util.*;

public class uncheckedException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the First Number");
            int num1 = sc.nextInt();
            System.out.println("Enter the Second Number");
            int num2 = sc.nextInt();

            int ans = num1/num2;
            System.out.println(ans);

        } catch (InputMismatchException e) {
            System.out.println("Input Missmatch error:- " + e.getMessage());
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception:- " + e.getMessage() );
        }
        
        sc.close();

    }
}
