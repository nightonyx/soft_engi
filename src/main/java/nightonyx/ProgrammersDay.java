package nightonyx;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.springframework.lang.NonNull;

public class ProgrammersDay {

    @NonNull private final int errorCode;
    @NonNull private final String date;

    public ProgrammersDay(final int errorCode, final String date) {
        this.errorCode = errorCode;
        this.date = date;
    }

    @NonNull
    public int getErrorCode() {
        return errorCode;
    }

    @NonNull
    public String getDate() {
        return date;
    }

    @NonNull
    public static String createDate(@NonNull final int year) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        Calendar calendar;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            calendar = new GregorianCalendar(year, Calendar.SEPTEMBER, 12);
        } else {
            calendar = new GregorianCalendar(year, Calendar.SEPTEMBER, 13);
        }
        return dateFormat.format(calendar.getTime());
    }
}
