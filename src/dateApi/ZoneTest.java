package dateApi;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneTest {

    public static void main(String[] args) {
        ZoneId defaultZone=ZoneId.systemDefault();
        System.out.println(defaultZone);
        Set<String> zoneIds=ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);

        System.out.println("---------");

        LocalDate ldt=LocalDate.now();
        ZonedDateTime zdt =ZonedDateTime.now();
        System.out.println(ldt);
        System.out.println(zdt);
    }
}
