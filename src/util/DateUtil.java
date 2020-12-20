package util;

import java.text.SimpleDateFormat;

public class DateUtil {
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public static String getDate(Object date){

        return sdf.format(date);
    }
}
