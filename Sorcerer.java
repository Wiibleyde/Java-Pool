public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    public int getCurrentHealth() {
        return this.currentHealth;
    }

    @Override
    public void attack(Character character) {
        this.heal(this);
        character.takeDamage(10);
    }

    @Override
    public void takeDamage(int damage) {
        this.currentHealth = Math.max(this.currentHealth-damage, 0);
    }

    @Override
    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void heal(Character character) {
        int currentHealth = character.getCurrentHealth();
        int newHealth = currentHealth + this.healCapacity;
        if (newHealth > character.getMaxHealth()) {
            newHealth = character.getMaxHealth();
        }
        character.currentHealth = newHealth;
    }

    @Override
    public String toString() {
        if (this.currentHealth == 0) {
            return this.getName() + " is a dead sorcerer. So bad, it could heal " + this.healCapacity + " HP.";
        }
        return this.getName() + " is a sorcerer with " + this.currentHealth + " HP. It can heal " + this.healCapacity + " HP.";
    }
}