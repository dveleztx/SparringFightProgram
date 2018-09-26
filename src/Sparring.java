import java.util.concurrent.ThreadLocalRandom;

public class Sparring {

    /* Main */
    public static void main(String[] args) {

        header();
        sparring();
    }

    /* Print Header */
    public static void header() {

        /* In Morpheus's Voice from The Matrix */
        System.out.println("-----------------------------");
        System.out.println("      Sparring Program");
        System.out.println("-----------------------------");
        System.out.println();
    }

    public static void sparring() {

        /* Create Players for Sparring */
        Player david = new Player("David", "Human", 200, 10);
        Player artem = new Player("Artem", "Human", 200, 10);

        /* Initiative */
        int davidsTurn;
        int artemsTurn;

        /* Who goes first */
        do {
            davidsTurn = ThreadLocalRandom.current().nextInt(20) + 1;
            artemsTurn = ThreadLocalRandom.current().nextInt(20) + 1;
        } while (davidsTurn == artemsTurn);

        System.out.println("David's Initiative: " + davidsTurn);
        System.out.println("Artem's Initiative: " + artemsTurn);

        /* Fight */
        if (davidsTurn > artemsTurn) {
            while (david.getHitPoints() > 0 && artem.getHitPoints() > 0) {
                david.attack(artem);
                artem.attack(david);
            }
        }
        else {
            while (david.getHitPoints() > 0 && artem.getHitPoints() > 0) {
                artem.attack(david);
                david.attack(artem);
            }
        }

        /* Victory Announcement */
        System.out.println();
        if (david.getHitPoints() > 0) {
            System.out.println(david.getName() + " is the winner of the fight with " + david.getHitPoints() + " hit points!");
        }
        else {
            System.out.println(artem.getName() + " is the winner of the fight with " + artem.getHitPoints() + " hit points!");
        }
    }
}
