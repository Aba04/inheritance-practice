package Book;

public class FromOverduedStatusMover extends BookMover{
    public void moveToStatus(Book book, Status requestedStatus) {
        String errorMessage = "ПеревоПеревод книги из статуса 'X' в статус 'Y' невозможен";
        if (book.getStatus() != Status.OVERDUED) {
            System.out.println(errorMessage);
            return;
        }
        switch (requestedStatus) {
            case ARCHIVED -> book.setStatus(Status.ARCHIVED);
            case AVAILABLE -> book.setStatus(Status.AVAILABLE);
            default -> System.out.println(errorMessage);
        }
    }
}
