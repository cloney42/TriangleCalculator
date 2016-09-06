package trianglecalculator;
import java.util.Scanner;
public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in 3 sides.");
        System.out.println("Side 1: ");
        double s1 = input.nextDouble();
        System.out.println("Side 2: ");
        double s2 = input.nextDouble();
        System.out.println("Side 3: ");
        double s3 = input.nextDouble();
        double maxOfSides = Math.max(s1, Math.max(s2, s3));
        if (s1 == s2 && s2 == s3){
            System.out.println("This triangle is equilateral");
            System.exit(0);
        }
        if (s1 == maxOfSides){
            if ((s2+s3)>s1){
                System.out.println("ERROR: Not a triangle.");
                System.exit(0);
            }
        }
        if (s2 == maxOfSides){
            if((s1+s3)>s2){
                System.out.println("ERROR: Not a triangle.");
                System.exit(0);
            }
        }
        if (s3 == maxOfSides){
            if((s1+s2)>s3){
                System.out.println("ERROR: Not a triangle.");
                System.exit(0);
            }
        }
        if (s1 != s2 && s1 != s3 && s2 != s3){
            System.out.println("This triangle is scalene.");
            System.exit(0);
        }
        if (s1 == s2 && s1 != s3){
            System.out.println("This triangle is isosceles");
            System.exit(0);
        }
        if (s1 == s3 && s1 != s2){
            System.out.println("This triangle is isosceles");
            System.exit(0);
        }
        if (s2 == s3 && s2 != s1){
            System.out.println("This triangle is isosceles");
            System.exit(0);
        }
        System.out.println("Unknown Triangle");
    }
}
