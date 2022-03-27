package Book;

public class FromAvailableStatusMover extends BookMover {
    public void moveToStatus(Book book, Status requestedStatus) {
        String errorMessage = "ПеревоПеревод книги из статуса 'X' в статус 'Y' невозможен";
        if (book.getStatus() != Status.AVAILABLE) {
            System.out.println(errorMessage);
            return;
        }
        switch (requestedStatus) {
            case BORROWED -> book.setStatus(Status.AVAILABLE);
            case ARCHIVED -> book.setStatus(Status.ARCHIVED);
            default -> System.out.println(errorMessage);
        }
    }
}