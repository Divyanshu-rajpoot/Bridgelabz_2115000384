public class Question7 {
    public static void main(String[] args) {
        //radius of earth 
        int earth_radius_km = 6378;
        double earth_radius_Miles = earth_radius_km * 1.6;
        //volume of earth 
        double volumeInKm = (4 * Math.PI * earth_radius_km *earth_radius_km * earth_radius_km)/3;
        double volumeInMiles = (4 * Math.PI * earth_radius_Miles *earth_radius_Miles * earth_radius_Miles)/3;
        System.out.println("The volume of earth in cubic kilometer is " + volumeInKm + " and Cubic Miles is " + volumeInMiles);
    }
    
}