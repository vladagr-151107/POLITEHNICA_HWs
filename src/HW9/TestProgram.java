package HW9;
import java.util.Calendar;

public class TestProgram {
    public static void main(String[] args) {
        // Create a university with a maximum of 2 authors
        University university = new University(2);  // Adjust the number as needed

        Author author1 = new Author("Alice");
        Author author2 = new Author("Bob");

        // Create Calendar instances for each publication's apparition date
        Calendar apparition1 = Calendar.getInstance();
        apparition1.set(2023, Calendar.JANUARY, 1);
        Calendar apparition2 = Calendar.getInstance();
        apparition2.set(2023, Calendar.JUNE, 1);
        Calendar apparition3 = Calendar.getInstance();
        apparition3.set(2023, Calendar.MARCH, 1);
        Calendar apparition4 = Calendar.getInstance();
        apparition4.set(2023, Calendar.JULY, 1);

        Calendar apparition5 = Calendar.getInstance();
        apparition5.set(2023, Calendar.FEBRUARY, 1);
        Calendar apparition6 = Calendar.getInstance();
        apparition6.set(2023, Calendar.AUGUST, 1);
        Calendar apparition7 = Calendar.getInstance();
        apparition7.set(2023, Calendar.APRIL, 1);
        Calendar apparition8 = Calendar.getInstance();
        apparition8.set(2023, Calendar.SEPTEMBER, 1);

        author1.addPublication(new Journal("Journal1", apparition1, 3, "Science Today", 2.0));
        author1.addPublication(new Journal("Journal2", apparition2, 2, "Tech World", 3.5));
        author1.addPublication(new ConferenceProceeding("Conf1", apparition3, 3, "ConfA", true));
        author1.addPublication(new ConferenceProceeding("Conf2", apparition4, 2, "ConfB", false));

        author2.addPublication(new Journal("Journal3", apparition5, 4, "Health Journal", 4.0));
        author2.addPublication(new Journal("Journal4", apparition6, 2, "AI Research", 5.0));
        author2.addPublication(new ConferenceProceeding("Conf3", apparition7, 3, "ConfC", true));
        author2.addPublication(new ConferenceProceeding("Conf4", apparition8, 4, "ConfD", false));

        university.addAuthor(author1);
        university.addAuthor(author2);

        // Compute and display scores
        System.out.println("Author 1 Score: " + author1.computeScore());
        System.out.println("Author 2 Score: " + author2.computeScore());
        System.out.println("University Score: " + university.computeScore());
    }
}
