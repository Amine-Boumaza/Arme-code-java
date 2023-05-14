public class TestRobot {
    public static void main(String[] args) {
        Arme arme1 = new Arme(10);
        Arme arme2 = new Arme(20);
        Robot robot1 = new Robot(new Position(0, 0), 0, 100, arme1);
        Robot robot2 = new Robot(new Position(10, 10), Math.PI / 2, 200, arme2);
        robot1.avancer(5);
        robot2.tirerDansDirection(Math.PI);
        robot1.sauter();
        robot2.tourner(Math.PI / 4);
        robot1.changerArme(arme2);
        System.out.println("Robot 1 : position = " + robot1.getPosition() + ", direction = " + robot1.getDirection() + ", force vitale = " + robot1.getForceVitale() + ", cartouche = " + robot1.getArmeCourante().getcartouche());
        System.out.println("Robot 2 : position = " + robot2.getPosition() + ", direction = " + robot2.getDirection() + ", force vitale = " + robot2.getForceVitale() + ", cartouche = " + robot2.getArmeCourante().getcartouche());
    }
}