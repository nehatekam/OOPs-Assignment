class Distance{
    protected  double distanceMiles;
    public Distance(double distanceMiles){
        this.distanceMiles=distanceMiles;
    }
    public void travelTime(){
        double time = distanceMiles/60;
        System.out.println("Travel time at 60 mph "+time+" hours");
    }
}
class DistanceMKS extends Distance{
    public DistanceMKS(double distanceMiles){
        super(distanceMiles);
    }
    public void travelTime() {
    double distanceKm = distanceMiles * 1.60934;
    double time = distanceKm / 100;
    System.out.println("Travel time at 100 km/h: " + time + " hours");
    }
}
public class Q12 {
    public static void main(String[] args) {
        Distance distance = new Distance(120);
        distance.travelTime();
        System.out.println();
        DistanceMKS distanceMKS = new DistanceMKS(120);
        distanceMKS.travelTime();

    }
}
