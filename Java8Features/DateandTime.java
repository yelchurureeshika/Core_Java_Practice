package Java8Features;


import java.time.*;


public class DateandTime {
    public static void main(String[] args) {
        LocalTime t=LocalTime.now();
        System.out.println(t);
        LocalDate d=LocalDate.now();
        System.out.println(d);
        LocalDate d1=LocalDate.of(2000,8,10);
        System.out.println(d1);
        LocalDateTime dt=LocalDateTime.now();
        System.out.println(dt);

        LocalTime t1=LocalTime.now(ZoneId.of("America/Cuiaba"));
        System.out.println(t1);
        LocalTime t2=LocalTime.now(ZoneId.of("Europe/Tiraspol"));
        System.out.println(t2);
//        for(String s:ZoneId.getAvailableZoneIds()){
//            System.out.println(s);
//
//        }


    }
}
