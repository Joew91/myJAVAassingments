import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.Month;

public class Calender {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Month month = today.getMonth();
        int year = today.getYear();
        System.out.printf("%15s %d/n,", month, year);
        System.out.println("MOn Tue Wed Thu Fri Sat Sun");
        LocalDate firstofMonth = today.minusDays(today.getDayOfMonth() - 1);
        DayOfWeek startDay = firstofMonth.getDayOfWeek();
        int startDayValue = startDay.getValue();
        for (int i = 1; i < startDayValue; i++) {
            System.out.print("    ");
            int dayInMonth = month.length(today.isLeapYear());
            for (int day = 1; day <= dayInMonth; day++) {
                if (day == today.getDayOfMonth()) {
                    System.out.printf("%3d*", day);
                } else {
                    System.out.printf("%4d", day);

                }
                if ((day + startDayValue - 1) % 7 == 0) {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}
