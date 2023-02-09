public class Monster extends Character {
    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }
    
    public void attack(Character character) {
        character.takeDamage(7);
    }

    public void takeDamage(int damage) {
        int damageTaken = (int) Math.ceil(damage * 0.8);
        this.currentHealth -= damageTaken;
    }

    @Override
    public String toString() {
        return (getCurrentHealth()<=0 ? "<name> is a monster and is dead" : "<name> is a monster with <currentHealth> HP")
        .replace("<name>", getName())
        .replace("<currentHealth>", Integer.toString(this.getCurrentHealth()));
    }
}
