
package ac.at.fh_kufstein_U2;

public class Student extends Kind {
    
    long matrikelnummer;
    String studiengang;

    public Student(long matrikelnummer, String studiengang, String vorname, String nachname, int alter) {
        super(vorname, nachname, alter);
        this.matrikelnummer = matrikelnummer;
        this.studiengang = studiengang;
    }

    @Override
    public String Status() {
        return "Es handelt sich um einen Studenten mit dem Namen: " + getVorname() + " " + getNachname() + " und ist " + getAlter() + " Jahre alt, hat die Matrikelnummer: " + matrikelnummer + " und studiert " + studiengang;
    }
    
    public static void main(String[] args) {
        
        Kind k = new Kind("Florian","Dodegge",26);
        System.out.println(k.Status());
        
        k = new Student(1310653831,"WEB","Florian","Dodegge",26);
        System.out.println(k.Status());
    }
}
