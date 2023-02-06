import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {
        return dateTime.format(java.time.format.DateTimeFormatter.ofPattern("'Le' dd MMMM 'de' 'l'\'an 'yyyy' à 'HH'h'mm'm et' ss's'"));
    }

    public static String formatSimple(LocalDate date) {
        return date.format(java.time.format.DateTimeFormatter.ofPattern("MMMM dd yy"));
    }

    public static String formatIso(LocalTime time) {
        return time.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSSSSS"));
    }

}