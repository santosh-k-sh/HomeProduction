package org.homeproduction.java8.datetime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by santosh.sharma on 7/20/2018.
 */
public class LocaleDatesExample {
    public static void main(String[] args) {
        LocalDate localDate = addDate(new Date(), 1);
        System.out.println(localDate);
    }

    public static LocalDate addDate(Date date, long noOfDays) {
        /* java.util.Date instance has no concept of time-zone.
        * An 'Instant' also does not contain any information about the time-zone.
        * Thus, to convert from an Instant to a local date, it is necessary to specify a time-zone.
        * ZoneId.systemDefault() gives the default time-zone. Use the atZone() method to apply the time-zone*/
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.plusDays(noOfDays);
    }

}
