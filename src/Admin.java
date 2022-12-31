public class Admin extends  Book{
    public void addBook(Book b,String n,String a, int id,int q){
        b.addBook(n,a,id,q);
        System.out.println("Book Added Sucessfully");

    }
    public void viewBook(Book b){
        b.viewBook();
    }
}
