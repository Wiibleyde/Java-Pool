public class Templar extends Character implements Healer, Tank {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
        this.shield = shield;
    }

    public int getHealCapacity() {
        return healCapacity;
    }

    @Override
    public void attack(Character character) {
        this.heal(this);
        character.takeDamage(6);
    }

    @Override
    public void takeDamage(int damage) {
        int damageTaken = damage - this.shield;
        if (damageTaken < 0) {
            damageTaken = 0;
        }
        this.currentHealth = Math.max(0, this.currentHealth - damageTaken);
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

    public int getShield() {
        return shield;
    }

    @Override
    public String toString() {
        if (this.currentHealth == 0) {
            return this.getName() + " has been beaten, even with its " + this.shield + " shield. So bad, it could heal " + this.healCapacity + " HP.";
        }
        return this.getName() + " is a strong Templar with " + this.currentHealth + " HP. It can heal " + this.healCapacity + " HP and has a shield of " + this.shield + ".";
    }
}