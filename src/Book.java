public class Book {
    String title;
    String author;
    int bookid;
    int quintity;
    int price;

    public  void addBook(String t,String a,int bid,int q){
        title=t;
        bookid=bid;
        quintity=q;
    }
    public  void searchBook(int num2,int bid){
        if (num2 == bid){
            System.out.println("Book Found....");
            System.out.println(title);System.out.println(author);System.out.println(bookid);
        }else{
            System.out.println("Book Not Avialbale");
        }
    }

    public void viewBook(){
        System.out.println("Book Title "+title);
        System.out.println("Book Id "+bookid);
        System.out.println("Quintity "+quintity);
    }
    public int borrowBook(int id,int num,int q){
        if(num <=10){
            System.out.println("You can Borrow Book");
            q=num;
            return 1;
        }else{
            System.err.println("Sorry....... You cant borrow book ");
            return  0;
        }
    }
}
