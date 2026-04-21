import java.util.Scanner;
public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Hình tròn 1:");
        System.out.println("Bán kính: " + circle1.getRadius());
        System.out.println("Diện tích: " + circle1.getArea());

        System.out.println("---------------------------");

        Circle circle2 = new Circle(2.5);
        System.out.println("Hình tròn 2:");
        System.out.println("Bán kính: " + circle2.getRadius());
        System.out.printf("Diện tích: %.2f\n", circle2.getArea());
    }
}
