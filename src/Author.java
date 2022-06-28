public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }

    public boolean authorEquals(Object author) {
        Author authors = (Author) author;
        if (this == authors) return true;
        else if (this.name == authors.getName() && this.surname == authors.getSurname()) return true;
        else
            return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + this.surname.hashCode();
    }
}
