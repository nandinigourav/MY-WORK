import java.util.*;
public class radiuscircle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius");
        int r = sc.nextInt();

        double circumference = 2 * Math.PI * r;
        double area = Math.PI*r*r; 
        
        System.out.println("Radius:" +r);
        System.out.println("Circumference:" +circumference);
        System.out.println("Area:" +area);

    }
    
}
