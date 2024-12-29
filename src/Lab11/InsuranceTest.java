package Lab11;

public class InsuranceTest {
    public static void main(String[] args) {
        LifeInsurance lifeInsurance = new LifeInsurance("Leila", "Rare", "Straus, 135", "quarterly");
        lifeInsurance.computeAmountPerPeriod();
        lifeInsurance.computeSum();
        AccidentInsurance accidentInsurance = new AccidentInsurance("Lili", "Querel", "Mozart, 123", "half-yearly");
        accidentInsurance.computeAmountPerPeriod();
        accidentInsurance.computeSum();
        System.out.println(lifeInsurance + "\n");
        System.out.println(accidentInsurance);
    }
}

