package com.example.learning.stringdate.date1;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {

        Instant i1 = getInstant();
        System.out.println(i1);

        ZonedDateTime z1 = getZoneDateTime();
        System.out.println(z1);

        LocalDateTime l1 = geLocalTime();
        System.out.println(l1);

        LocalDate d1 = getPeriod();
        System.out.println(d1);
    }

    public static Instant getInstant() {
        Instant i1 = Instant.now();
        return i1;
    }

    public static ZonedDateTime getZoneDateTime() {
        ZonedDateTime z1 = ZonedDateTime.of(2023, 7, 1, 2, 3, 4, 5, ZoneId.of("Asia/Tokyo"));
        return z1;
    }

    public static LocalDateTime geLocalTime() {
        LocalDateTime l1 = LocalDateTime.of(2023, 7, 1, 2, 3, 4, 0);
        return l1;
    }

    public static LocalDate getPeriod() {
        LocalDate d1 = LocalDate.of(2023, 7, 1);
        LocalDate d2 = LocalDate.of(2023, 7, 4);

        Period p1 = Period.ofDays(3);
        Period p2 = Period.between(d1, d2);
        LocalDate d3 = d2.plus(p2);

        return d3;
    }
}
