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
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        return localDate.plusDays(noOfDays);
    }

}
