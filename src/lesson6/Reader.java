package lesson6;

public class Reader {
    private String fio;
    private int number;
    private String date;
    private String phone;
    private String faculty;
    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getFio() {
        return fio;
    }

    public int getNumber() {
        return number;
    }

    public String getDate() {
        return date;
    }

    public String getPhone() {
        return phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void takeBook(int numberOfBooksTaken) {
        System.out.println(fio + " взял " + numberOfBooksTaken + " книг ");
    }

    public void takeBook(String... books) {
        System.out.println(fio + " взял книги: " + String.join(", ", books));
    }

    public void returnBook(int numberOfBooksReturn) {
        System.out.println(fio + " вернул " + numberOfBooksReturn + " книг ");
    }

    public void returnBook(String... books) {
        System.out.println(fio + " вернул книги: " + String.join(", ", books));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reader reader = (Reader) o;

        if (number != reader.number) return false;
        if (fio != null ? !fio.equals(reader.fio) : reader.fio != null) return false;
        if (date != null ? !date.equals(reader.date) : reader.date != null) return false;
        if (phone != null ? !phone.equals(reader.phone) : reader.phone != null) return false;
        return faculty != null ? faculty.equals(reader.faculty) : reader.faculty == null;
    }
}
