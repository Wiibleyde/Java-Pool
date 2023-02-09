import java.util.ArrayList;
import java.util.List;

public class Character {
    private final int maxHealth;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters = new ArrayList<Character>();

    public Character(String name, int maxHealth) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.currentHealth = maxHealth;
        addCharacter(this);
    }

    public int getMaxHealth() {
        return this.maxHealth;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        if (this.currentHealth == 0) {
            return this.name + " : KO";
        }
        return this.name + " : " + this.currentHealth + "/" + this.maxHealth;
    }

    public void takeDamage(int damage) {
        if (this.currentHealth - damage < 0) {
            this.currentHealth = 0;
        } else {
            this.currentHealth -= damage;
        }
    }

    public void attack(Character character) {
        character.takeDamage(9);
    }

    public void addCharacter(Character character) {
        allCharacters.add(character);
    }

    public static List<Character> getAllCharacters() {
        return allCharacters;
    }

    public static String printStatus() {
        String line = "------------------------------------------";
        String title = "Characters currently fighting :";
        String characters = "";
        if (getAllCharacters().isEmpty()) {
            return line + "\nNobody's fighting right now !\n" + line;
        }
        for (Character character : getAllCharacters()) {
            characters += " - " + character.toString() + "\n";
        }
        return line + "\n" + title + "\n" + characters + "\n" +  line;
    }

    public static Character fight(Character character1, Character character2) {
        while (character1.getCurrentHealth() > 0 && character2.getCurrentHealth() > 0) {
            character1.attack(character2);
            if (character2.getCurrentHealth() > 0) {
                character2.attack(character1);
            }
        }
        if (character1.getCurrentHealth() == 0) {
            return character2;
        }
        return character1;
    }
}
