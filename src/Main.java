/* Napisati klasu radnik, ima parametre jmbg, ime, prezime i godinu zaposlenja.
Napraviti metodu koja proverava da li je zaposlen u firmi duze od 10 godina.
U main metodi napraviti 3 radnika pomocu 2 razlicita konstruktora (jedan default i jedan sa svim parametrima).
Definisati u mainu i promenljivu za tekucu godinu i upisati vrednost.
Ta promenljiva se prosledjuje u metodu u klasi radnik kako bi se izracunalo da li je radnik u firmi duze od 10 godina.
Ta promenljiva se koristi da bi koristili istu vrednost za sve radnike.
Ispisati radnik taj i taj jeste/nije duze u firmi (mozete za to koristiti metodu)
 */

public class Main {
    public static void main(String[] args) {

        int currentYear = 2022;

        Employee employee1 = new Employee();
        employee1.socialID = "2205988910122";
        employee1.firstName = "Milan";
        employee1.lastName = "Stanojevic";
        employee1.employmentYear = 2011;

        Employee employee2 = new Employee();
        employee2.socialID = "2511989910122";
        employee2.firstName = "Dusica";
        employee2.lastName = "Stanojevic";
        employee2.employmentYear = 2018;

        Employee employee3 = new Employee("0611964727828", "Tomislav", "Stanojevic", 2005);

        employee1.checkEmploymentYear(currentYear);
        employee2.checkEmploymentYear(currentYear);
        employee3.checkEmploymentYear(currentYear);
    }
}
