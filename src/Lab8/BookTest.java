package Lab8;

public class BookTest {
    public static void main(String[] args){
        Author author = new Author("Student", "student@upb.ro", 'f');
        Book aBook = new Book("Java for dummies", author, 19.95, 1000);
        Book anotherBook = new Book("C for dummies", new Author("Teacher", "teacher@upb.ro", 'm'), 29.95,999);
        //a
        System.out.println(aBook.toString());
        System.out.println(anotherBook.toString());
        System.out.println(aBook.getAuthorName());
        System.out.println(aBook.getAuthorEmail());
        System.out.println(aBook.getAuthorGender());
        System.out.println(anotherBook.getAuthorName());
        System.out.println(anotherBook.getAuthorEmail());
        System.out.println(anotherBook.getAuthorGender());
    }
}
