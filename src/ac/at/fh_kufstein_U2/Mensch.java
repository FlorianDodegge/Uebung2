
package ac.at.fh_kufstein_U2;

public class Mensch extends Saeugetier {

    public Mensch(String name, int alter, String geschlecht) {
        super(name, alter, geschlecht);
    }
    
    public String printAll() {
        return name + " # " + alter + " # " + geschlecht;
    }
    
    public static void main(String[] args) {
        
        Mensch m = new Mensch("Florian",26,"männlich");
        System.out.println(m.printAll());
    }
}
