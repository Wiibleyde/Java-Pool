public class Monster extends Character {
    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }
    
    // @Override
    // public String toString() {
    //     if (this.getCurrentHealth() == 0) {
    //         return this.getName() + " is a monster and is dead";
    //     }
    //     return this.getName() + " is a monster with " + this.getMaxHealth() + " HP";
    // }

    @Override
    public String toString() {
        return getCurrentHealth() > 0 ? "<name> is a monster with <maxHealth> HP".replace("<name>", getName()).replace("<maxHealth>", String.valueOf(getMaxHealth())) : "<name> is a monster and is dead".replace("<name>", getName());
    }
}
