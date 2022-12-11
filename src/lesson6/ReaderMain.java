package lesson6;

public class ReaderMain {
    public static void main(String[] args) {

        Reader st1 = new Reader();
        Reader st2 = new Reader();

        Book book1 = new Book("Война и мир", "Лев толстой");
        Book book2 = new Book("Горе от ума", "Александр Грибоедов");
        Book book3 = new Book("Капитанская дочка", "Александр Пушкин");
        Book book4 = new Book("Толстый и тонкий", "Антон Чехов");

        st1.setFio("Петров В. В.");
        st1.setNumber(215);
        st1.setDate("25/09/1990");
        st1.setFaculty("Менеджмент");
        st1.setPhone("8321573582");

        st2.setFio("Ершов С. А.");
        st2.setNumber(216);
        st2.setDate("17/04/1998");
        st2.setFaculty("Бурение");
        st2.setPhone("8945873348");

        Reader[] students = new Reader[]{st1, st2};

        System.out.println();

        st1.takeBook(5);
        st1.takeBook("Война и мир", "Горе от ума");
        st1.takeBook(book3.parametrName(), book4.parametrName());

        System.out.println();

        st2.returnBook(20);
        st2.returnBook("Капитанская дочка", "Толстый и тонкий");
        st2.returnBook(book1.parametrName(), book2.parametrName());

        System.out.println();

    }
}
