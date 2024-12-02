package HW9;
import java.util.Calendar;

class Journal extends Publication {
    private String journalName;
    private double impactFactor;

    public Journal(String name, Calendar apparition, double numberOfAuthors, String journalName, double impactFactor) {
        super(name, apparition, numberOfAuthors);  // Passing the numberOfAuthors to the superclass constructor
        this.impactFactor = impactFactor;
        this.journalName = journalName;
    }

    @Override
    public double computeScore() {
        // Check for zero to avoid division by zero
        if (numberOfAuthors == 0) {
            System.out.println("Warning: Number of authors is zero for journal: " + this.name);
            return 0;  // Return 0 if the number of authors is zero
        }
        return (impactFactor * 0.5) / numberOfAuthors;
    }
}

