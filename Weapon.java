public class Weapon {
    private final String name;
    public int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    @Override
    public String toString() {
        return "<name> deals <damage> damages".replace("<name>", this.name).replace("<damage>", "" + this.damage);
    }
}
