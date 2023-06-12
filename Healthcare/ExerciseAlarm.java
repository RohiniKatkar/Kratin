package Healthcare;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class ExerciseAlarm {

    public static void main(String[] args) {
        // Set the time for the daily alarm
        Calendar alarmTime = Calendar.getInstance();
        alarmTime.set(Calendar.HOUR_OF_DAY, 6);  
        alarmTime.set(Calendar.MINUTE, 0);       
        alarmTime.set(Calendar.SECOND, 0);    

    
        Timer timer = new Timer();

        // Create a TimerTask to run when the alarm goes off
        TimerTask exerciseTask = new TimerTask() {
            @Override
            public void run() {
                
                System.out.println("Time to yoga!");
            }
        };

   
        Calendar currentTime = Calendar.getInstance();

      
        long delay = alarmTime.getTimeInMillis() - currentTime.getTimeInMillis();

   
        timer.schedule(exerciseTask, delay, 24 * 60 * 60 * 1000);
    }
}
