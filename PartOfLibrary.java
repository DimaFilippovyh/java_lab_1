// Абстрактный класс PartOfLibrary необходим для того, чтобы от него наследовались классы Book и Reader

public abstract class PartOfLibrary {
    protected int id; // id должности
    protected String name; // название
    protected int yearRegistrationInLibrary; // год регистрации в библиотеке

    public PartOfLibrary() {
    } // конструктор без параметров

    public PartOfLibrary(int id, String name, int yearRegistrationInLibrary) { // конструктор с параметрами
        this.id = id;
        this.name = name;
        this.yearRegistrationInLibrary = yearRegistrationInLibrary;
    }

    public PartOfLibrary(PartOfLibrary v) { // конструктор копирования
        this.id = v.id;
        this.name = v.name;
        this.yearRegistrationInLibrary = v.yearRegistrationInLibrary;
    }

    // ниже все геттеры и сеттеры

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearRegistrationInLibrary() {
        return yearRegistrationInLibrary;
    }
}