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
        } while(davidsTurn == artemsTurn);
}
