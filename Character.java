public class Character {
    private final Integer maxHealth = 100;
    private Integer currentHealth;
    private final String name;

    public Character(String name, Integer maxHealth) {
        this.name = name;
        this.currentHealth = maxHealth;
    }

    public Integer getMaxHealth() {
        return this.maxHealth;
    }

    public Integer getCurrentHealth() {
        return this.currentHealth;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        if (this.currentHealth == 0) {
            return this.name + " : KO";
        }
        return this.name + " : " + this.currentHealth + "/" + this.maxHealth;
    }

    public void takeDamage(Integer damage) {
        if (this.currentHealth - damage < 0) {
            this.currentHealth = 0;
        } else {
            this.currentHealth -= damage;
        }
    }

    public void attack(Character character) {
        character.takeDamage(9);
    }
}
