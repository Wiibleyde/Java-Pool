import java.util.List;
import java.util.Collections;

public class ExerciseRunner {

    public static void main(String[] args) {
        System.out.println(Sort.sort(List.of(15, 1, 14, 18, 14, 98, 54, -1, 12)).toString());
        System.out.println(Sort.sortReverse(List.of(15, 1, 14, 18, 14, 98, 54, -1, 12)).toString());
    }
}