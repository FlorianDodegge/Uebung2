
package ac.at.fh_kufstein_U2;

public class Kind {
    
    private String vorname;
    private String nachname;
    private int alter;

    public Kind(String vorname, String nachname, int alter) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }
    
    public String Status() {
        return "Es handelt sich um ein Kind mit dem Namen: " + vorname + " " + nachname + " und ist: " + alter + " Jahre alt.";    
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
    
    
}
