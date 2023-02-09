public class ExerciseRunner {

    public static void main(String[] args) {
         Character aragorn = new Monster("Goblin", 30);
         Monster slime = new Monster("Leviathan", 0);

        System.out.println(Character.printStatus());

         Character winner = Character.fight(aragorn, slime);
        System.out.print(winner);
        System.out.println(Character.printStatus());
    }
}