public class Robot {
    private Position position;
    private double direction;
    private int forceVitale;
    private Arme armeCourante;
    
    public Robot(Position position, double direction, int forceVitale, Arme armeCourante) {
        this.position = position;
        this.direction = direction;
        this.forceVitale = forceVitale;
        this.armeCourante = armeCourante;
    }
    
    public void avancer(double distance) {
        double dx = distance * Math.cos(direction);
        double dy = distance * Math.sin(direction);
        position.setX(position.getX() + (int) dx);
        position.setY(position.getY() + (int) dy);
    }
    
    public void     tourner(double angle) {
        direction = (direction + angle) % (2 * Math.PI);
    }
    
    public void changerArme(Arme nouvelleArme) {
        armeCourante = nouvelleArme;
    }
    
    public void tirer() {
        armeCourante.tirer();
    }
    
    public void tirerDansDirection(double direction) {
        this.direction = direction;
        tirer();
    }
    
    public void sauter() {
        if (forceVitale < 10) {
            System.out.println("Le robot n'a pas assez de force vitale pour sauter.");
            return;
        }
        System.out.println("Le robot saute !");
        forceVitale -= 10;
        position.deplacer(0, 10);
    }
    
    public Position getPosition() {
        return position;
    }
    
    public void setPosition(Position position) {
        this.position = position;
    }
    
    public double getDirection() {
        return direction;
    }
    
    public void setDirection(double direction) {
        this.direction = direction;
    }
    
    public int getForceVitale() {
        return forceVitale;
    }
    
    public void setForceVitale(int forceVitale) {
        this.forceVitale = forceVitale;
    }
    
    public Arme getArmeCourante() {
        return armeCourante;
    }
    
    public void setArmeCourante(Arme armeCourante) {
        this.armeCourante = armeCourante;
    }
}