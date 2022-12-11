package lesson6;

public class Book {
    private String name;
    private String author;

    public Book(String nameOfBook, String authorOfBook) {
        this.name = nameOfBook;
        this.author = authorOfBook;
    }

    public String parametrName() {
        return name;
    }

    public void setName(String nameOfBook) {
        this.name = nameOfBook;
    }

    public String parametrAuthor() {
        return author;
    }

    public void setAuthor(String authorOfBook) {
        this.author = authorOfBook;
    }

    @Override
    public String toString() {
        return "Book{" + "nameOfBook='" + name + '\'' + ", authorOfBook='" + author + '\'' + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (parametrName() != null ? !parametrName().equals(book.parametrName()) : book.parametrName() != null)
            return false;
        return parametrAuthor() != null ? parametrAuthor().equals(book.parametrAuthor()) : book.parametrAuthor() == null;
    }

}
