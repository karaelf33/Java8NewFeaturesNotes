package streamExample;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingByTest {


    public static void main(String[] args) {
        Stream<String> s1=Stream.of("lions","tigers","bears","bird","horse","turtle","cat","cat","dog");
        Map<Integer, List<String>> map=s1.collect(Collectors.groupingBy(String::length));

        System.out.println(map);
        class Booking {
            int CustomerId;
            String Location;
            LocalDate Date;

            public Booking(int customerId, String location, LocalDate date){
                this.CustomerId = customerId;
                this.Location = location;
                this.Date = date;
            }
        }
        Booking[] bookingObj = {
                new Booking(111, "London", LocalDate.of(2019, 6, 12)),
                new Booking(114, "California", LocalDate.of(2021, 1, 11)),
                new Booking(42, "St.Andrews", LocalDate.of(2015, 9, 1)),
                new Booking(112, "Bangkok", LocalDate.of(2020, 5, 16)),
                new Booking(112, "Krakozhia", LocalDate.of(2021, 1, 11)),
                new Booking(113, "London", LocalDate.of(2018, 11, 5)),
                new Booking(111, "Texas", LocalDate.of(2017, 4, 1)),
                new Booking(114, "London", LocalDate.of(2015, 12, 25)),
                new Booking(111, "Texas", LocalDate.of(2016, 1, 11)),
                new Booking(152, "Wakanda", LocalDate.of(2018, 1, 29)),
                new Booking(113, "London", LocalDate.of(2021, 1, 11))
        };

       Map<Object, List<Booking>> listMap =Arrays.stream(bookingObj).collect(Collectors.groupingBy(populerLocaiton->populerLocaiton.Location));
        System.out.println(listMap.toString());

//        //
//        Map<Object,Integer> listMap= Arrays.stream(bookingObj).collect(Collectors.groupingBy(booking -> booking.Location));
//
//        Character.is

    }
}
// PrintOldestAndLatestBooking PrintOldestAndLatestBooking PrintMostBookedCustomer

//kelimedeki sesli harfleri bul ters çevir
