package Healthcare;

import java.time.LocalDate;
import java.time.LocalTime;

class HealthCareRoutine {
	    private LocalDate date;
	    private LocalTime time;
	    private String activity;

	    public HealthCareRoutine(LocalDate date, LocalTime time, String activity) {
	        this.date = date;
	        this.time = time;
	        this.activity = activity;
	    }

	    public void displayRoutine() {
	        System.out.println("Date: " + date);
	        System.out.println("Time: " + time);
	        System.out.println("Activity: " + activity);
	    }

	    public void updateActivity(String newActivity) {
	        activity = newActivity;
	        System.out.println("Activity updated successfully!");
	    }
	}



