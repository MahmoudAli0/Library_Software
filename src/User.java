public class User {
    int no_of_books=10;

    public void borrowBoks(Book b,int id,int num ,int q){
        b.borrowBook(id,num,q);
        System.out.println("==========================================");
        System.out.println("Book Borrowed Sucsessfuly ");
        System.out.println("------------------------------------------");
    }

    public  void searchBook(Book b,int num2,int bid){
        b.searchBook(num2,bid);
    }
    public void viewBook(Book b){
        b.viewBook();
    }
}
