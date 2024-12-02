package HW9;

public class University {
    private String name;
    private String location;
    private Author[] authors;
    public University(int maxAuthors) {
        this.authors = new Author[maxAuthors];
    }

    public void addAuthor(Author author) {
        for (int i = 0; i < authors.length; i++) {
            if (authors[i] == null) {
                authors[i] = author;
                return;
            }
        }
        System.out.println("Cannot add more authors. Maximum limit reached.");
    }
    public double computeScore() {
        double totalScore = 0;
        for (Author author : authors) {
            if (author != null) {
                totalScore += author.computeScore();
            }
        }
        return totalScore;
    }
}

