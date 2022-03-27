package Book;

public class FromArchievedStatusMover extends BookMover{

    @Override
    public void moveToStatus(Book book, Status requestedStatus) {
        String errorMessage = "ПеревоПеревод книги из статуса 'X' в статус 'Y' невозможен";
        if(book.getStatus() != Status.ARCHIVED){
            System.out.println(errorMessage);
            return;
        }
        if (requestedStatus == Status.AVAILABLE){
            book.setStatus(Status.AVAILABLE);
        }else {
            System.out.println(errorMessage);
        }
    }
}
