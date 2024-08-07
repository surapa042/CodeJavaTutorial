import java.util.Scanner;

public class Ex5_1 {
    public static double calculateTriangleArea(double base,double height){
        return 0.5 + base * height;
    }
    public static void main(String[] args ){
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Enter The base of the trinagle : ");
        double base = scanner.nextDouble();
        System.out.print ("Enter The height of the trinagle : ");
        double height  = scanner.nextDouble();
        double area = calculateTriangleArea(base, height);

        System.out.println("The area of the triangle is: " + area);
        scanner.close();
}
}