package Healthcare;

import java.time.LocalDate;
import java.time.LocalTime;

public class PersonalHealthCareRoutine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
        LocalTime currentTime = LocalTime.now();

        HealthCareRoutine routine = new HealthCareRoutine(today, currentTime, "Exercise");

        System.out.println("--- Current Health Care Routine ---");
        routine.displayRoutine();

        System.out.println("\n--- Update Health Care Routine ---");
        routine.updateActivity("Meditation");

        System.out.println("\n--- Updated Health Care Routine ---");
        routine.displayRoutine();
	}

}
