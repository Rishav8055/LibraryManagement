package data;


public class BookIMPL {
    public static void main(String[] args) {
        Book book =new Book();
        book.setAuthor("rishav");
        book.setName("Marvel");
        book.setYearOfPublication(2005);
        book.setIsbnNo("Mar123");
        book.setTitle("Infinity");

        System.out.println(book.getAuthor());
        System.out.println(book.getIsbnNo());
        System.out.println(book.getName());
        System.out.println(book.getTitle());
        System.out.println(book.getYearOfPublication());
    }
}