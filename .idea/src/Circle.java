import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите радиус: ");
        double radius = 2;
        double Black;
        double Color = Black;
        System.out.println("Цвет окружности: " + Color);
        double area = Math.PI * (radius * radius);
        System.out.println("Площадь круга равна: " + area);
        double circumference = Math.PI * 2 * radius;
        System.out.println("Длина окружности равна: " + circumference);

        public void toString (int radius, int area, int circumference){
            System.out.println(radius + area + circumference + Color);
        }
    }
}
