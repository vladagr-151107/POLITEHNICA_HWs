package Lab8;

public class PersonMain {
    public static void main(String[] args){
        PersonArray personArray = new PersonArray(5);
        personArray.insert("Lewis", "Benjamin", 38);
        personArray.insert("Walker", "Olivia", 26);
        personArray.insert("Johnson", "Mary", 30);
        personArray.insert("Brown", "Patricia", 40);
        personArray.insert("Jones", "Robert", 45);
        personArray.displayArray();

        String deleteSurname = "Jones";
        boolean deleteIT = personArray.delete(deleteSurname);
        if(deleteIT) {
            System.out.println(deleteSurname + " was deleted.");
        } else{
            System.out.println(deleteSurname + " was not found, sorry.");
        }
        personArray.displayArray();
    }
}
