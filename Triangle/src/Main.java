import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh 1 : ");
        double slide1 = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh 2 : ");
        double slide2 = scanner.nextDouble();
        System.out.print("Nhập độ dài cạnh 3 : ");
        double slide3 = scanner.nextDouble();
        scanner.nextLine();
        if (slide1 + slide2 <= slide3 || slide1 + slide3 <= slide2 || slide2 + slide3 <= slide1) {
            System.out.println("Các cạnh bạn nhập không hợp lệ để vẽ tam giác");
        } else {
            System.out.print("Nhập màu sắc tam giác : ");
            String color = scanner.nextLine();
            Triangle triangle = new Triangle(slide1, slide2, slide3, color);
            System.out.printf("Chu vi tam giác = %2.2f \n", triangle.getPerimeter());
            System.out.printf("Diện tích tam giác = %2.2f \n", triangle.getArea());
            System.out.println(triangle.toString());
        }
    }
}
