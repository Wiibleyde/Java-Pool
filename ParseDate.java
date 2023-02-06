import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ParseDate {
    public static LocalDateTime parseIsoFormat(String stringDate) {
        if (stringDate == null) return null;
        return LocalDateTime.parse(stringDate);
    }
    public static LocalDate parseFullTextFormat(String stringDate) {   
        if (stringDate == null) return null;
        return LocalDate.parse(stringDate, java.time.format.DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy"));
    }
    public static LocalTime parseTimeFormat(String stringDate) {
        if (stringDate == null) return null;
        stringDate = stringDate.replace("du soir", "PM");
        stringDate = stringDate.replace("du matin", "AM");
        return LocalTime.parse(stringDate, java.time.format.DateTimeFormatter.ofPattern("hh 'heures du' a ',' mm 'minutes et' ss 'secondes'"));
    }
}