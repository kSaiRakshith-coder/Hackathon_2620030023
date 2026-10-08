import java.util.*;
public class Hackathon_3c {
    static double CalculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Waste Collected at Point 1 (kg): ");
        double point1Waste = sc.nextDouble();

        System.out.print("Enter Waste Collected at Point 2 (kg): ");
        double point2Waste = sc.nextDouble();

        double totalWaste = CalculateTotalWaste(point1Waste, point2Waste);
        System.out.println("Total Waste Collected: " + totalWaste);
    }
}
