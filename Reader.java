import java.util.ArrayList;

public class Reader extends PartOfLibrary { // класс Читатель
    private boolean inBlackList; // читатель в черном списке
    private int yearOfBirth; // год рождения
    private int countOfBooksTaken; // количество взытх книг
    private ArrayList<Book> listOfBooks; // список книг у пользователя

    public Reader() { // конструктор без параметров
        super(); // инициализация элемента родительского класса
    }

    public Reader(int id, String name, int yearRegistrationInLibrary,
            boolean inBlackList, int yearOfBirth,
            int countOfBooksTaken, ArrayList<Book> listOfBooks) { // конструктор с параметрами
        super(id, name, yearRegistrationInLibrary);
        this.inBlackList = inBlackList;
        this.yearOfBirth = yearOfBirth;
        this.countOfBooksTaken = countOfBooksTaken;
        this.listOfBooks = listOfBooks;
    }

    public Reader(Reader reader) { // конструктор копирования
        super(reader.id, reader.name, reader.yearRegistrationInLibrary);
        this.inBlackList = reader.inBlackList;
        this.yearOfBirth = reader.yearOfBirth;
        this.countOfBooksTaken = reader.countOfBooksTaken;
        this.listOfBooks = reader.listOfBooks;
    }

    // ниже все геттеры и сеттеры + метод toString для удобства вывода

    public boolean getInBlackList() {
        return inBlackList;
    }

    public void setInBlackList(boolean val) {
        this.inBlackList = val;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int year) {
        this.yearOfBirth = year;
    }

    public int getCountOfBooksTaken() {
        return this.countOfBooksTaken;
    }

    public ArrayList<Book> getListOfBooks() {
        return listOfBooks;
    }

    public void removeBookTaken(Book Book) {
        if (this.getCountOfBooksTaken() < 1) {
            System.out.println("у пользователя нет книг");
            return;
        }
        this.listOfBooks.remove(Book);
        int currentCount = this.getCountOfBooksTaken() - 1;
        System.out.println("Осталось в списке: " + currentCount + " книг.");
        this.countOfBooksTaken = currentCount;
    }

    public void addBooksTaken(Book Book) {
        if (this.getInBlackList() == true) {
            System.out.println("Этот пользователь находится в черном списке, ему нельзя брать книги.");
            return;
        }
        this.listOfBooks.add(Book);
        int currentCount = this.getCountOfBooksTaken() + 1;
        System.out.println("теперь в списке у " + this.getName() + ": " + currentCount + " книг.");
        this.countOfBooksTaken = currentCount;
    }

    @Override
    public String toString() {
        return "Reader{" +
                "id=" + id +
                ", name=" + name +
                ", yearRegistrationInLibrary=" + yearRegistrationInLibrary +
                ", inBlackList=" + inBlackList +
                ", yearOfBirth=" + yearOfBirth +
                ", countOfBooksTaken=" + countOfBooksTaken +
                ", listOfBooks=" + listOfBooks +
                '}';
    }
}