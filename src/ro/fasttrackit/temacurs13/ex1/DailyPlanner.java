package ro.fasttrackit.temacurs13.ex1;

import java.util.*;


public class DailyPlanner {
    private final List<DaySchedule> daySchedules;


    public DailyPlanner(Collection<DaySchedule> daySchedules) {
        this.daySchedules = daySchedules == null
                ? new ArrayList<>()
                : new ArrayList<>(daySchedules);

    }

    public String addActivity(DaysOfTheWeek days, List<String> activities) {
        if (activities == null) {
            throw new NoActivityException(daySchedules);
        }
        return "no activity";
    }

    class NoActivityException extends RuntimeException {
        private final List<DaySchedule> daySchedules;

        public NoActivityException(List<DaySchedule> daySchedules) {
            this.daySchedules = new ArrayList<>();

        }
    }

    public String removeActivity(DaysOfTheWeek days, List<String> activities) {
        if (activities.isEmpty()) {
            throw new NoActivityException(daySchedules);
        }
        return "no activity found";
    }



    public List<String> getActivities(DaysOfTheWeek days) {
        List<String> result = new ArrayList<>();
        for (DaySchedule daySchedule : daySchedules) {
            if (daySchedule.getActivities().equals(days)) {
            }
        }
        return result;
    }
    public Map<DaysOfTheWeek, List<String>> endPlanning() {
        Map<DaysOfTheWeek, List<String>> result = new HashMap<>();
        for (DaySchedule daySchedule : daySchedules) {
            result.put(daySchedule.getDays(),daySchedule.getActivities());
            }
            return result;
        }
    }
