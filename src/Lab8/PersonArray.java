package Lab8;

public class PersonArray {
    private Person[] personArray;
    private int numberOfPeople;
    public PersonArray(int size){
        personArray = new Person[size];
        numberOfPeople = 0;
    }
    public void insert(String lastName, String firstName, int age){
        personArray[numberOfPeople] = new Person(firstName, lastName, age);
        numberOfPeople++;
    }
    public Person find(String searchName){
        for(int i=0; i < numberOfPeople; i++){
            if (personArray[i].getLast().equals(searchName)) {
                return personArray[i];
            }
        }
        return null;
    }
    public boolean delete(String searchName){
        for(int i=0; i< numberOfPeople; i++){
            if(personArray[i].getLast().equals(searchName)){
                for(int j = i; j < numberOfPeople - 1; i++){
                    personArray[j] = personArray[j+1];
                }
                personArray[numberOfPeople - 1] = null;
                numberOfPeople--;
                return true;
            }
        }
        return false;
    }
    public void displayArray(){
        for(int i = 0; i< numberOfPeople; i++){
            personArray[i].displayPerson();
        }
    }
}
