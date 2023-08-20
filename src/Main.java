
public class Main {

    public static void bookInformation(String title, String author, int yearPublishing) {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + yearPublishing);
    }

    public static void main(String[] args) {
        int yearReissue = 2023;
        Author authorOne = new Author("Рождественский", "Роберт");
        Author authorTwo = new Author("Симонов", "Константин");
        Author authorThree = new Author("Твардовский", "Александр");
        Book bookOne = new Book("Человеку надо мало", 1973, "Рожественский Роберт Иванович");
        Book bookTwo = new Book("Жди меня, и я вернусь", 1942, "Симонов Константин Михайлович");
        Book bookTree = new Book("О Родине",1941, "Твардовский Александр Трифонович");
        bookOne.setYearPublishing(yearReissue);
        bookTwo.setYearPublishing(yearReissue);
        bookTree.setYearPublishing(yearReissue);
        System.out.println("Перечень произведений:");
        System.out.print(authorOne.getWriterFirstName());
        System.out.print(" " + authorOne.getWriterMiddleName());
        System.out.println();
        System.out.print(authorTwo.getWriterFirstName());
        System.out.print(" " + authorTwo.getWriterMiddleName());
        System.out.println();
        System.out.print(authorThree.getWriterFirstName());
        System.out.print(" " + authorThree.getWriterMiddleName());
        System.out.println();
        bookInformation(bookOne.getTitle(), bookOne.getAuthor(), bookOne.getYearPublishing());
        bookInformation(bookTwo.getTitle(), bookTwo.getAuthor(), bookTwo.getYearPublishing());
        bookInformation(bookTree.getTitle(), bookTree.getAuthor(), bookTree.getYearPublishing());
    }
}