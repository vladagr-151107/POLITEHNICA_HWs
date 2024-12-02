package HW9;
import java.util.Calendar;

abstract class Publication {
    protected String name;  // Change to protected so it can be accessed in subclasses
    protected Calendar apparition;
    protected double numberOfAuthors;

    public Publication(String name, Calendar apparition, double numberOfAuthors) {
        this.name = name;
        this.apparition = apparition;
        this.numberOfAuthors = numberOfAuthors;
    }

    public double getNumberOfAuthors() {
        return numberOfAuthors;  // Getter for numberOfAuthors
    }

    public String getName() {
        return name;  // Getter for name
    }

    public abstract double computeScore();
}

