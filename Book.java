public class Book extends PartOfLibrary { // класс Книга
    private String author; // автор
    private int yearOfCreation; // год издания
    private int countOfPage; // количество страниц

    public Book() { // конструктор без параметров
        super(); // инициализация элемента родительского класса
    }

    public Book(int id, String name, int yearRegistrationInLibrary,
            String author, int yearOfCreation,
            int countOfPage) { // конструктор с параметрами
        super(id, name, yearRegistrationInLibrary);
        this.author = author;
        this.yearOfCreation = yearOfCreation;
        this.countOfPage = countOfPage;
    }

    public Book(Book book) { // конструктор копирования
        super(book.id, book.name, book.yearRegistrationInLibrary);
        this.author = book.author;
        this.yearOfCreation = book.yearOfCreation;
        this.countOfPage = book.countOfPage;
    }

    // ниже все геттеры и сеттеры + метод toString для удобства вывода

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfCreation() {
        return yearOfCreation;
    }

    public void setYearOfCreation(int year) {
        this.yearOfCreation = year;
    }

    public int getCountOfPage() {
        return countOfPage;
    }

    public void setCountOfPage(int count) {
        this.countOfPage = count;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name=" + name +
                ", yearRegistrationInLibrary=" + yearRegistrationInLibrary +
                ", author=" + author +
                ", yearOfCreation=" + yearOfCreation +
                ", countOfPage=" + countOfPage +
                '}';
    }
}