/* Napisati klasu radnik, ima parametre jmbg, ime, prezime i godinu zaposlenja.
Napraviti metodu koja proverava da li je zaposlen u firmi duze od 10 godina.
U main metodi napraviti 3 radnika pomocu 2 razlicita konstruktora (jedan default i jedan sa svim parametrima).
Definisati u mainu i promenljivu za tekucu godinu i upisati vrednost.
Ta promenljiva se prosledjuje u metodu u klasi radnik kako bi se izracunalo da li je radnik u firmi duze od 10 godina.
Ta promenljiva se koristi da bi koristili istu vrednost za sve radnike.
Ispisati radnik taj i taj jeste/nije duze u firmi (mozete za to koristiti metodu)
 */

public class Employee {

    String socialID;
    String firstName;
    String lastName;
    int employmentYear;

    public Employee() {

    }

    public Employee(String socialID, String firstName, String lastName, int employmentYear) {
        this.socialID = socialID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentYear = employmentYear;
    }

    public void checkEmploymentYear (int currentYear) {
        if ((currentYear - employmentYear) > 10) {
            System.out.println("Radnik " + firstName + " " + lastName + " je duze od 10 godina u firmi.");
        } else {
            System.out.println("Radnik " + firstName + " " + lastName + " nije duze od 10 godina u firmi.");
        }
    }
}
