package arrays;

public class Circle extends Area {
    int radius;

    @Override
    void collectdata() {
        System.out.print("Enter the radius of the circle: ");
        radius = sc.nextInt();
    }

    @Override
    void calculatedata() {
        area = pi * radius * radius;
    }
}
