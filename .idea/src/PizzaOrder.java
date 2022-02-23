import java.util.Scanner;

public class PizzaOrder {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

    boolean name;
    String size;
    boolean sause;
    boolean adress;
    boolean acceptOrder;

    new PizzaOrder(); {
            name = Boolean.parseBoolean("Polina");
            size = String.valueOf(40);
            sause = Boolean.parseBoolean("cheese");
            adress = Boolean.parseBoolean("Северная 10");

            System.out.print("Имя " + name );
            System.out.print("Размер " + size );
            System.out.print("Соус " + sause );
            System.out.print("Адрес  " + adress );

        }
    }
}
