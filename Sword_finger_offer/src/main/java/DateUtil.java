

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * DATE: 16/9/2 上午9:43 <br>
 * MAIL: zhanghecheng@terminus.io <br>
 * AUTHOR: zhanghecheng
 */
public class DateUtil {

    public final static DateTimeFormatter ISO = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public final static DateTimeFormatter COMPACT = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");

    public final static DateTimeFormatter COMPACT_DATE = DateTimeFormatter.ofPattern("yyyyMMdd");

    public final static DateTimeFormatter COMPACT_MONTH_DAY = DateTimeFormatter.ofPattern("MMdd");

    public static String toIsoDateTime(Date datetime){
        return datetime.toInstant().atZone(ZoneId.systemDefault()).format(ISO);
    }
    public static String toCompactDateTime(Date datetime){
        return datetime.toInstant().atZone(ZoneId.systemDefault()).format(COMPACT);
    }

    public static String toCompactMonthDay(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).format(COMPACT_MONTH_DAY);
    }

    public static String toCompactDate(Date date){
        return date.toInstant().atZone(ZoneId.systemDefault()).format(COMPACT_DATE);
    }

    public static Date fromIsoDateTime(String datetime){
        return fromDateTime(datetime,ISO);
    }

    public static Date fromCompactDateTime(String datetime){
        return fromDateTime(datetime,COMPACT);
    }


    public static Date fromDateTime(String datetime, DateTimeFormatter formatter){
        return new Date(LocalDateTime.parse(datetime, formatter).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
    }

    public static Date fromLocateDate(LocalDate date){
        return new Date(date.toEpochDay()*24*3600*1000);
    }

    public static Date fromLocalDateTime(LocalDateTime dateTime){
        return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    public static Date fromInstant(Instant instant){
        return new Date(instant.toEpochMilli());
    }

    public static Long timeoutMinutes(Date timeoutAt){
        return ChronoUnit.MINUTES.between(Instant.now(), timeoutAt.toInstant());
    }

    public static Long minutesBetween(Date start, Date end){
        return ChronoUnit.MINUTES.between(start.toInstant(), end.toInstant());
    }
}
