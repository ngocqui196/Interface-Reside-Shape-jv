import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập kích thước hình tròn muốn thay đổi");
//        double number = Double.parseDouble(sc.nextLine());
        Circle circle = new Circle();
        Circle[] circles = new Circle[5];
        circles[0] = new Circle(3.0);
        circles[1] = new Circle(10.0);
        circles[2] = new Circle(20.0);
        circles[3] = new Circle(12.0);
        circles[4] = new Circle(8.0);

        for (Circle c: circles) {
            int random = (int) Math.floor((Math.random()* 99)+1);
            c.resize(random);
            System.out.println(c.getArea());
        }


//        circle.resize(number);
//        System.out.println(circle);
//
//        circle = new Circle(3.5);
//        System.out.println(circle);
//
//        circle = new Circle(3.5, "indigo", false);
//        System.out.println(circle);
    }
}
