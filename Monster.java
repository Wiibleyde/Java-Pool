public class Monster extends Character {
    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }
    
    @Override
    public void attack(Character character) {
        character.takeDamage(7);
    }

    @Override
    public void takeDamage(int damage) {
        this.currentHealth -= Math.floor(damage * 0.8);
    }

    @Override
    public String toString() {
        return (getCurrentHealth()<=0 ? "<name> is a monster and is dead" : "<name> is a monster with <currentHealth> HP")
        .replace("<name>", getName())
        .replace("<currentHealth>", Integer.toString(this.getCurrentHealth()));
    }
}
