package ro.fasttrackit.temacurs13.ex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class DaySchedule {
    private DaysOfTheWeek days;
    private final List<String> activities;


    public DaySchedule(DaysOfTheWeek days,List<String> activities) {
        this.days = days;
        this.activities = activities;

    }
    public DaySchedule(List<String> activities) {

        this.activities = activities == null
                ? new ArrayList<String>()
                : new ArrayList<String>(activities);


    }

        public DaysOfTheWeek getDays() {
        return days;
    }
    public List<String> getActivities(){
        return activities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaySchedule that = (DaySchedule) o;
        return days == that.days && Objects.equals(activities, that.activities);
    }

    @Override
    public int hashCode() {
        return Objects.hash(days, activities);
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "days=" + days +
                ", activities=" + activities +
                '}';
    }
}


