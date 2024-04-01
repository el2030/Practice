package DateTime;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class Second {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        long millis = System.currentTimeMillis();
        java.sql.Date date2 = new java.sql.Date(millis);
        System.out.println(date2);

        String sdate = "2024-03-28";
        java.sql.Date date3 = java.sql.Date.valueOf(sdate);
        System.out.println(date3);

        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DATE, 10);
        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.YEAR, 2000);
        System.out.println(cal);

        Date d1 = cal.getTime();
        System.out.println(d1);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println(sdf.format(d1));
        sdf = new SimpleDateFormat("dd/MMM/YYYY");
        System.out.println(sdf.format(d1));
        sdf = new SimpleDateFormat("dd/MMMM/YYYY");
        System.out.println(sdf.format(d1));
    }
}
