package practice_questions.week09;

public class Q04 {
    /*
    Type code to add books to library with its information, then create a method to show information of book.
     */
    String bookName;
    String authorName;
    int numberOfPage;
    static int numberOfBooks;
    String bookId ;

    public Q04(String bookName, String authorName, int numberOfPage) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.numberOfPage = numberOfPage;
        this.bookId = bookName.substring(0,2)+numberOfBooks;
        numberOfBooks++;
        showBookInfo();
    }

    public static void main(String[] args) {
        Q04 book1 = new Q04("Oliver Twist","Wilson",180);
        Q04 book2 = new Q04("Punisher","Frank Castle",120);

    }

    private void showBookInfo(){
        System.out.println("Book Name: "+bookName+
                "\nAuthor Name: "+ authorName+
                "\nNumber Of Page: "+ numberOfPage+
                "\nBook Id: "+ bookId +
        "\n\n");
    }
}
