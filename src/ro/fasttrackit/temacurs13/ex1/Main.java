package ro.fasttrackit.temacurs13.ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DailyPlanner dailyPlanner = new DailyPlanner(List.of(
                new DaySchedule( DaysOfTheWeek.MONDAY, List.of("jogging")),
                        new DaySchedule( DaysOfTheWeek.TUESDAY,List.of("swimming")),
                        new DaySchedule( DaysOfTheWeek.WEDNESDAY,List.of("play football")),
                        new DaySchedule( DaysOfTheWeek.THURSDAY,List.of("play tennis")),
                        new DaySchedule( DaysOfTheWeek.FRIDAY,List.of("climb mountains")),
                        new DaySchedule( DaysOfTheWeek.SATURDAY,List.of("running")),
                        new DaySchedule( DaysOfTheWeek.SUNDAY,List.of("jogging"))
        ));


        System.out.println(dailyPlanner.addActivity(DaysOfTheWeek.MONDAY,List.of("jogging")));
        System.out.println(dailyPlanner.removeActivity(DaysOfTheWeek.TUESDAY,List.of("swimming")));
        System.out.println(dailyPlanner.getActivities(DaysOfTheWeek.WEDNESDAY));
        System.out.println(dailyPlanner.endPlanning());







    }
        }
