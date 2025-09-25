import java.util.Scanner;

public class TimeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance: ");
        double distance = sc.nextDouble();
        System.out.println("Enter the speed: ");
        double speed = sc.nextDouble();
        System.out.println("Time to reach the destination: " + calTime(distance, speed) + " hours");
    }

    public static double calTime(double x, double v) {
        return  x / v;
    }
}
