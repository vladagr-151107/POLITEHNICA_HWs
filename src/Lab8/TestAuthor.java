package Lab8;

public class TestAuthor {
    public static void main(String[] args){
        Author anAuthor = new Author("Author", "Author@upb.ro", 'f');
        System.out.println(anAuthor);
        anAuthor.setEmail("Author@fils.upb.ro");
        System.out.println(anAuthor.toString());
    }
}
