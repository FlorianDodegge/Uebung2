
package ac.at.fh_kufstein_U2;

abstract class Saeugetier {
    
    String name;
    int alter;
    String geschlecht;

    public Saeugetier(String name, int alter, String geschlecht) {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }
    
    public abstract String printAll();
    
}
