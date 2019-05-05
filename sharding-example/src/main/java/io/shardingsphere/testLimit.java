package io.shardingsphere;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.util.Date;

/**
 * @atuthor lanping
 * @email lanping@cvte.com
 * @Decription TODO
 * @date 2019-04-25 11:26
 */
public class testLimit {


    public static void main(String[] args) throws Exception {

//        int pageSize = 5;
//        Integer total = 15;
//        int currentPage = 1,
//                totalPage = (total % pageSize == 0) ? (total / pageSize) : (total / pageSize + 1);
//        while(currentPage <= totalPage) {
//
//            ResourceUtils.queryAndOutput("sharding.yaml",
//                    "SELECT id AS id, username AS userName FROM t_admin_users t WHERE t.isDeleted = 0");
//            currentPage ++;
//        }



//        LocalDateTime dateTime1 = LocalDateTime.of(2019, 3, 12, 8, 30);
//        System.out.println("2019-03-12 08:30:00 毫秒数 = " + dateTime1.toInstant(ZoneOffset.of("+8")).toEpochMilli());
//
//
//        LocalDateTime dateTime2 = LocalDateTime.of(2019, 3, 15, 8, 30);
//        System.out.println("2019-03-15 08:30:00 毫秒数 = " + dateTime2.toInstant(ZoneOffset.of("+8")).toEpochMilli());
//
//
//        LocalDateTime dateTime3 = LocalDateTime.of(2019, 4, 11, 8, 30);
//        System.out.println("2019-04-11 08:30:00 毫秒数 = " + dateTime1.toInstant(ZoneOffset.of("+8")).toEpochMilli());
//
//        LocalDateTime dateTime4 = LocalDateTime.of(2019, 5, 10, 8, 30);
//        System.out.println("2019-04-10 08:30:00 毫秒数 = " + dateTime2.toInstant(ZoneOffset.of("+8")).toEpochMilli());



//        LocalDateTime dateTime1 = LocalDateTime.of(2019, 3, 12, 8, 40);
//        System.out.println(Date.from(dateTime1.toInstant(ZoneOffset.of("+8"))) + " 毫秒数 = " + dateTime1.toInstant(ZoneOffset.of("+8")).toEpochMilli());
//
//
//        LocalDateTime dateTime2 = LocalDateTime.of(2019, 3, 15, 9, 20);
//        System.out.println(Date.from(dateTime2.toInstant(ZoneOffset.of("+8"))) + " 毫秒数 = " + dateTime2.toInstant(ZoneOffset.of("+8")).toEpochMilli());
//
//
//        LocalDateTime dateTime3 = LocalDateTime.of(2019, 4, 11, 10, 30);
//        System.out.println(Date.from(dateTime3.toInstant(ZoneOffset.of("+8"))) + " 毫秒数 = " + dateTime3.toInstant(ZoneOffset.of("+8")).toEpochMilli());
//
//        LocalDateTime dateTime4 = LocalDateTime.of(2019, 5, 10, 11, 00);
//        System.out.println(Date.from(dateTime4.toInstant(ZoneOffset.of("+8"))) + " 毫秒数 = " + dateTime4.toInstant(ZoneOffset.of("+8")).toEpochMilli());
//


        LocalDateTime dateTime5 = LocalDateTime.of(2019, 4, 30, 8, 40);
        System.out.println(Date.from(dateTime5.toInstant(ZoneOffset.of("+8"))) + " 毫秒数 = " + dateTime5.toInstant(ZoneOffset.of("+8")).toEpochMilli());


        LocalDateTime dateTime6 = LocalDateTime.of(2019, 4, 30, 9, 20);
        System.out.println(Date.from(dateTime6.toInstant(ZoneOffset.of("+8"))) + " 毫秒数 = " + dateTime6.toInstant(ZoneOffset.of("+8")).toEpochMilli());


    }

}
