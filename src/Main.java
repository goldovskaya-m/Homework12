public class Main {
    public static void main(String[] args) {
        System.out.println("Homework12");
        Author author = new Author("Александр", " Пушкин ");
        Author author2 = new Author("Александр", " Грин ");
        Book book = new Book("Медный всадник", author, 1883);
        Book book2 = new Book("В снегу", author2, 1910);
        System.out.println(author.getFirstName());
        System.out.println(author.getLastName());
        System.out.println(book.getTitle());
        System.out.println(book.getYear());
        System.out.println(author2.getFirstName());
        System.out.println(author2.getLastName());
        System.out.println(book2.getTitle());
        System.out.println(book2.getYear());
        book2.setYear(1915);
        System.out.println(book2.getYear());
    }
}