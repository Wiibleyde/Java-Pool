public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println(ParseDate.parseIsoFormat("2022-04-25T20:51:28.709039322"));
        System.out.println(ParseDate.parseFullTextFormat("vendredi 18 mai 2018"));
        System.out.println(ParseDate.parseTimeFormat("09 heures du soir, 07 minutes et 23 secondes"));
    }
}