package com.porto.revisao.src.main.java.org.porto.date;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TestandoDatas {

    public static void main(String[] args) {

        LocalDate dt1 = LocalDate.now();
        LocalDateTime dt2 = LocalDateTime.now();
        Instant dt3 = Instant.now();

        LocalDate dt4 = LocalDate.parse("2023-12-05");
        LocalDateTime dt5 = LocalDateTime.parse("2023-12-05T12:12:12");
        Instant dt6 = Instant.parse("2023-12-05T12:12:12Z");

        System.out.println(dt1);
        System.out.println(dt2);
        System.out.println(dt3);
        System.out.println(dt4);
        System.out.println(dt5);
        System.out.println(dt6);

        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
        // DateTimeFormatter

        System.out.println();

        LocalDate date1 = LocalDate.parse("2023-12-06");
        LocalDateTime date2 = LocalDateTime.parse("2023-12-06T12:30:25");

        Instant date3 = Instant.parse("2023-12-06T12:30:20Z");

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        System.out.println();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("Data 1 = " + date1.format(formatter));
        System.out.println("Data 1 = " + formatter.format(date1));
        System.out.println("Data 1 = " + date2.format(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm")));

        System.out.println("Data 2 = " + date2.format(formatter));
        System.out.println("Data 2 = " + date2.format(formatter2));

        System.out.println("Data 3 = " + formatter3.format(date3));


        // Novos Exemplos
        // Convertendo data hora global para local

        System.out.println();

        LocalDate date4 = LocalDate.parse("2023-12-06");
        LocalDateTime date5 = LocalDateTime.parse("2023-12-06T12:30:25");

        Instant date6 = Instant.parse("2023-12-06T01:30:20Z");

        // Todos os time zones disponiveis
//        for (String time:
//             ZoneId.getAvailableZoneIds()) {
//            System.out.println(time);
//        }

        LocalDate r1 = LocalDate.ofInstant(date6, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(date6, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(date6, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(date6, ZoneId.of("Portugal"));

        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);
        System.out.println("R3 = " + r3);
        System.out.println("R4 = " + r4);


        System.out.println("Date 4 dia = " + date4.getDayOfMonth());
        System.out.println("Date 4 mês = " + date4.getMonthValue());
        System.out.println("Date 4 Ano = " + date4.getYear());
        System.out.println("Date 4 dia da semana = " + date4.getDayOfWeek());
        System.out.println();

        System.out.println("Date 5 hora = " + date5.getHour());
        System.out.println("Date 5 minuto = " + date5.getMinute());


        // Calculo de horarios

        LocalDateTime datNasc = LocalDateTime.parse("1992-12-11T18:20:30");

        int yearNasc = datNasc.getYear();
        int yearNow = LocalDateTime.now().getYear();

        System.out.println("Idade Atual: " + (yearNow - yearNasc));

        LocalDate pastWeekLocalDate = date4.minusWeeks(1);
        LocalDate nextWeekLocalDate = date4.plusWeeks(1);

        System.out.println();
        System.out.println("Data Atual: " + date4);
        System.out.println("Semana passada: " + pastWeekLocalDate);
        System.out.println("Próxima semana: " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = date5.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = date5.plusDays(7);
        LocalDateTime nextHoursTime = date5.plusHours(18);


        System.out.println();
        System.out.println("Data/hora Atual: " + date5);
        System.out.println("Semana passada: " + pastWeekLocalDateTime);
        System.out.println("Próxima semana: " + nextWeekLocalDateTime);
        System.out.println("Algumas horas depois: " + nextHoursTime);

        Instant pastWeekInstant = date6.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = date6.plus(7, ChronoUnit.DAYS);
        Instant nextHoursInstant = date6.plus(18, ChronoUnit.HOURS);
        Instant anyMinutesInstant = date6.plus(63, ChronoUnit.MINUTES);


        System.out.println();
        System.out.println("Data/hora Atual: " + date6);
        System.out.println("Semana passada: " + pastWeekInstant);
        System.out.println("Próxima semana: " + nextWeekInstant);
        System.out.println("Algumas horas depois: " + nextHoursInstant);
        System.out.println("Alguns minutos : " + anyMinutesInstant);


        /// Duração

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), date4.atTime(1,12,30));
        Duration t2 = Duration.between(pastWeekLocalDateTime, date5);
        Duration t3 = Duration.between(pastWeekInstant, date6);

        System.out.println();

        System.out.println("T1 em minutos = " + t1.toMinutes());
        System.out.println("T2 em horas = " + t2.toHours());
        System.out.println("T3 em dias = " + t2.toDays());







    }
}