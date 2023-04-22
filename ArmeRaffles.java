

public class ArmeRaffles extends Arme {

    private int n;
    
    public  ArmeRaffles(int cartouches, int n) {
        super(cartouches);
        this.n=n;
    }

    public void tirer() {
        this.setcartouche(this.getcartouche()-this.n);
    }


}
