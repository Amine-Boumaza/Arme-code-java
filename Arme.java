/**
 * Arme
 */
public class Arme{
    private int cartouche;

    public Arme(int cartouche) {
        this.cartouche = cartouche;
    }

    public void tirer() {
        this.cartouche--;
    }

    public void charger(int cartouche) {
        this.cartouche += cartouche;
    }

    public int getcartouche() {
        return this.cartouche;
    }
    
    public int setcartouche(int cartouche) {
        return this.cartouche=cartouche;
    }
}