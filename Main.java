import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Создание экземпляров класса Book

        Book b1 = new Book(
                1,
                "Book1",
                2020,
                "Author1",
                2000,
                200);
        Book b2 = new Book(
                2,
                "Book2",
                2021,
                "Author2",
                2001,
                201);
        Book b3 = new Book(
                3,
                "Book3",
                2022,
                "Author3",
                2002,
                202);

        // Создание экземпляров класса Reader

        Reader r1 = new Reader(
                1,
                "Reader1",
                2018,
                false,
                2000,
                0,
                new ArrayList<Book>());

        Reader r2 = new Reader(
                2,
                "Reader2",
                2019,
                false,
                2001,
                0,
                new ArrayList<Book>());

        Reader r3 = new Reader(
                3,
                "Reader3",
                2015,
                false,
                2003,
                0,
                new ArrayList<Book>());

        r2.addBooksTaken(b1);
        r3.addBooksTaken(b1);
        r3.addBooksTaken(b2);
        r3.addBooksTaken(b3);

        Book b4 = new Book(b1); // Проверяем работоспособность конструктора копирования
        Reader r4 = new Reader(r1);

        System.out.println(b1); // Выводим все книги
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4); // Вывод работы конструктора копирования

        System.out.println();

        System.out.println(r1); // Выводим всех читателей
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4); // Результать работы конструктора копирования

        System.out.println();

        System.out.println();
        System.out.println();

        r1.removeBookTaken(b1); // ошибка о том что нельзя убрать книгу

        System.out.println(b1.getAuthor()); // отрабатывают методы базового класса
        System.out.println(b1.getId());

        r3.removeBookTaken(b2);
        r3.setInBlackList(true);
        r3.addBooksTaken(b2); // ошибка о том что нельзя добавить тк в черном списке

        b1.setCountOfPage(11);
        System.out.println(b1);
    }
}