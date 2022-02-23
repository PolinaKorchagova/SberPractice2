public class Book<Author> {
    private int name;
    private int gender;
    private int email;
    private int year;
    private int title;
    private Object Author;

    void Author(int name, int gender, int email) {
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    void Book(int year, int title, Author) {
        this.year = year;
        this.title = title;
        this.Author = Author;
    }

    public static void main(String[] args){


    }
    class BookDriver {

        String name;
        String gender;
        String email;
        int year;
        String title;
        String Author;
        void displayInfo() {
            System.out.println("Имя: " + name);
            System.out.println("Пол: " + gender);
            System.out.println("Почта: " + email);
            System.out.println("Год: " + year);
            System.out.println("Название: " + title);
            System.out.println("Автор: " + Author);
        }


    }
}
