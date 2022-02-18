public class Main {
    public static void main(String[] args) throws Exception {
        Book b1 = new Book("Pinocchio");
        Book b2 = new Book("Java 8");
        Book b3 = new Book("La bella e la bestia");
        
        
        Library lb = new Library();
        lb.addBook(b1);
        lb.addBook(b2);
        lb.addBook(b3);

        lb.loanBook(b3);
        lb.loanBook(b2);
        lb.loanBook(b1);
        
        lb.printLoans();

        lb.returnBook(b2);

        Tool.stamaTrattini();
        lb.printLoans();

    }
}
