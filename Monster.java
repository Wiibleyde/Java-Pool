public class Monster extends Character {
    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }
    
    // @Override
    // public String toString() {
    //     if (this.getCurrentHealth() == 0) {
    //         return this.getName() + " is a monster and is dead";
    //     }
    //     return this.getName() + " is a monster with " + this.getCurrentHealth() + " HP";
    // }

    @Override
    public String toString() {
        return (getCurrentHealth()<=0 ? "<name> is a monster and is dead" : "<name> is a monster with <currentHealth> HP")
        .replace("<name>", getName())
        .replace("<currentHealth>", Integer.toString(this.getCurrentHealth()));
    }
}
