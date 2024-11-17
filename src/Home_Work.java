import java.util.Arrays;

public class Home_Work {
    public static void main(String[] args) {
    Boss Boss = new Boss();
    Boss.setDamage(50) ;
    Boss.setHealth(1000);
    Boss.setBossDefence("physical");
        System.out.println("Boss Health: " + Boss.getHealth() +
                " Boss Defence: " + Boss.getBossDefence()
        + " Boss Damage: " + Boss.getDamage());

        Hero[] hero = createHeroes();
        for (int i = 0; i < hero.length; i++) {
            System.out.println("Hero healtth: " + hero[i].getHealth()
                    + " Hero damage: " + hero[i].getDamage() +" Hero Defence: "
            + (hero[i].getSuperAbility() != null ? hero[i].getSuperAbility() : "None"));

        }

    }
    public static Hero[] createHeroes() {
        Hero physical = new Hero(300, 25);
        Hero mediccal = new Hero(250, 0, "restorationOfHealth");
        Hero magical = new Hero(250, 20);
        Hero[] heroes = {physical, mediccal, magical};
        return heroes;
    }
}
