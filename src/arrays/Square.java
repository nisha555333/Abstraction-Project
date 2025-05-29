package arrays;

public class Square extends Area {
    int side;

    @Override
    void collectdata() {
        System.out.print("Enter the side of a square: ");
        side = sc.nextInt();
    }

    @Override
    void calculatedata() {
        area = side * side;
    }
}
