package arrays;

public class Triangle extends Area {
    double base, height;

    @Override
    void collectdata() {
        System.out.print("Enter the base of the triangle: ");
        base = sc.nextDouble();
        System.out.print("Enter the height of the triangle: ");
        height = sc.nextDouble();
    }

    @Override
    void calculatedata() {
        area = 0.5 * base * height;
    }
}
