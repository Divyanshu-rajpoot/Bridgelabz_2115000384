import java.util.Scanner;

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distanceInFeet = sc.nextInt();
        double distanceInYards = distanceInFeet / 3 ;
        double distanceInMiles = distanceInYards / 1760;
        System.out.println("Distance in Yard is " + distanceInYards + " and in miles is " + distanceInMiles);
        sc.close();
    }
}
