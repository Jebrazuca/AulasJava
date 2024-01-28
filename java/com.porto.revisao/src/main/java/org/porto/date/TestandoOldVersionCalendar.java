package com.porto.revisao.src.main.java.org.porto.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class TestandoOldVersionCalendar {

    public static void main(String[] args) throws ParseException {

        // Somando unidade de tempo
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date = Date.from(Instant.parse("2024-01-25T21:15:40Z"));

        System.out.println(sdf.format(date));

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        calendar.add(Calendar.HOUR_OF_DAY, -2);

        date = calendar.getTime();

        System.out.println(sdf.format(date));


        // Obtendo unidade de tempo
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date date2 = Date.from(Instant.parse("2024-01-25T21:15:40Z"));

        System.out.println(sdf.format(date2));


        Calendar cal = Calendar.getInstance();
        cal.setTime(date2);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);

        System.out.println("Hour: " + hour);
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);


    }
}
