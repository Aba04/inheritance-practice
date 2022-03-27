package Book;

public class FromBorrowedStatusMover extends BookMover{
    public void moveToStatus(Book book, Status requestedStatus) {
        String errorMessage = "ПеревоПеревод книги из статуса 'X' в статус 'Y' невозможен";
        if (book.getStatus() != Status.BORROWED) {
            System.out.println(errorMessage);
            return;
        }
        switch (requestedStatus) {
            case AVAILABLE -> book.setStatus(Status.AVAILABLE);
            case ARCHIVED -> book.setStatus(Status.ARCHIVED);
            case OVERDUED -> book.setStatus(Status.OVERDUED);
            default -> System.out.println(errorMessage);
        }
    }
}
