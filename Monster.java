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
        return getCurrentHealth() > 0 ? getName() + " is a monster with " + getMaxHealth() + " HP" : getName() + " is a monster and is dead";
    }
}
