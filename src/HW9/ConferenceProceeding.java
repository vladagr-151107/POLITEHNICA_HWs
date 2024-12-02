package HW9;

import java.util.Calendar;

class ConferenceProceeding extends Publication {
    private String volumeName;
    private boolean indexed;
    public ConferenceProceeding(String name, Calendar apparition, double numberOfAuthors, String volumeName, boolean indexed) {
        super(name, apparition, numberOfAuthors);
        this.volumeName = volumeName;
        this.indexed = indexed;
    }
    @Override
    public double computeScore() {
        if (indexed) {
            return 0.25 / getNumberOfAuthors();
        } else {
            return 0.2 / getNumberOfAuthors();
        }
    }
}
