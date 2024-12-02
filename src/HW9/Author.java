package HW9;

public class Author {
    private String name;
    private Publication[] publications = new Publication[5];

    public Author(String name) {
        this.name = name;
    }

    public void addPublication(Publication publication) {
        for (int i = 0; i < publications.length; i++) {
            if (publications[i] == null) {
                publications[i] = publication;
                return;
            }
        }
    }
    public double computeScore(){
        double totalScore = 0;
        for(Publication publication: publications){
            if (publication != null) {
                totalScore += publication.computeScore();
            }
        }
        return totalScore;
    }
}
