public class Main {
    public static void main(String[] args) {
        System.out.println("Homework12");
        Author author = new Author("Александр", " Пушкин");
        Author author2 = new Author("Александр", " Грин");
        Book book = new Book("Медный всадник", author, 1883);
        Book book2 = new Book("В снегу", author2, 1910);
        System.out.printf(author.firstName);
        System.out.println(author.lastName);
        System.out.println(book.title);
        System.out.println(book.year);
        System.out.printf(author2.firstName);
        System.out.println(author2.lastName);
        System.out.println(book2.title);
        System.out.println(book2.getYear());
        book2.setYear(1915);
        System.out.println(book2.getYear());
    }
}