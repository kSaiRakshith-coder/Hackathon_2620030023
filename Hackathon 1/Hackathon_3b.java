import java.util.*;
public class Hackathon_3b {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Waste collected in kg: ");
        double waste = sc.nextDouble();

        if(waste >= 100){
            System.out.println("collection target acheived");
        }else {
            System.out.println("More waste collection required");
        }

    } 
}