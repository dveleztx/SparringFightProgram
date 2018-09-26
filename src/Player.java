import java.util.concurrent.ThreadLocalRandom;

public class Player {

    /* Private Variables */
    private String name;
    private String race;
    private int hitPoints;
    private int armorClass;

    /* Constructor */
    public Player (String name, String race, int hitPoints, int armorClass) {

        this.name = name;
        this.race = race;
        this.hitPoints = hitPoints;
        this.armorClass = armorClass;
    }

    /* Getters */
    public String getName() {

        return name;
    }
    public String getRace() {

        return race;
    }
    public int getHitPoints() {

        return hitPoints;
    }
    public int getArmorClass() {

        return armorClass;
    }

    /* Setters */
    public void setName(String newName) {

        this.name = newName;
    }

    /* Method */
    public void attack (Player target) {

        boolean crit = false;

        /* Hit */
        if (hitPoints > 0) {

            /* Roll to Attack */
            int roll = ThreadLocalRandom.current().nextInt(20) + 1;

            if (roll == 20) {
                crit = true;
            }

            if (roll >= target.armorClass) {

                int damage = ThreadLocalRandom.current().nextInt(10) + 1;

                if (crit) {
                    damage *= 3;
                }

                target.hitPoints -= damage;

                /* Damage Logic */
                if (target.hitPoints > 0 && crit) {
                    System.out.println(name + " rolled a " + roll + " and CRITS " + target.name + " for " + damage + " damage!");
                }
                else if (target.hitPoints > 0) {
                    System.out.println(name + " rolled a " + roll + " and hits " + target.name + " for " + damage + " damage!");
                } else {
                    System.out.println(name + " rolled a " + roll + " and slays " + target.name + " for " + damage + " damage!!");
                }
            }
            /* Miss */
            else {
                System.out.println(name + " rolled a " + roll + " and misses " + target.name);
            }
        }
    }
    public int damage () {

        return 0;
    }
}

