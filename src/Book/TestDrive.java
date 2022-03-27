package Book;

public class TestDrive {
    public static void main(String[] args) {
        Book book = new Book("The Lord of yhe Rings");
        BookMover bookMoverAvailable = new FromAvailableStatusMover();
        bookMoverAvailable.moveToStatus(book, Status.ARCHIVED);
        System.out.println("Статус вашей книги:" + book.getStatus());
        BookMover bookMoverArchived = new FromArchievedStatusMover();
        bookMoverArchived.moveToStatus(book, Status.AVAILABLE);
        System.out.println("Статус вашей книги:" + book.getStatus());
        bookMoverAvailable.moveToStatus(book, Status.BORROWED);
        System.out.println("Статус вашей книги:" + book.getStatus());
        BookMover bookMoverBorrowed = new FromBorrowedStatusMover();
        bookMoverBorrowed.moveToStatus(book, Status.OVERDUED);
        System.out.println("Статус вашей книги:" + book.getStatus());
        BookMover bookMoverOverdued = new FromOverduedStatusMover();
        bookMoverOverdued.moveToStatus(book, Status.AVAILABLE);
        System.out.println("Статус вашей книги:" + book.getStatus());
    }
}
