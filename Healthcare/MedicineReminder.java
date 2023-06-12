package Healthcare;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MedicineReminder {
    private Timer timer;

    public void setDailyReminder(int hour, int minute) {
        timer = new Timer();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, 0);

        Date reminderTime = calendar.getTime();
        Date currentTime = new Date();

        // If the reminder time is already passed for today, schedule it for tomorrow
        if (currentTime.after(reminderTime)) {
            calendar.add(Calendar.DATE, 1);
            reminderTime = calendar.getTime();
        }

        long delay = reminderTime.getTime() - currentTime.getTime();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                // Replace this with your code to remind about the medicine
                System.out.println("Time to take your medicine!");
            }
        }, delay, 24 * 60 * 60 * 1000); // Repeat every 24 hours

        System.out.println("Daily reminder set at " + hour + ":" + minute);
    }

    public void cancelReminder() {
        if (timer != null) {
            timer.cancel();
            System.out.println("Daily reminder canceled.");
        }
    }

    public static void main(String[] args) {
        MedicineReminder reminder = new MedicineReminder();
        reminder.setDailyReminder(9, 0); 

        
    }
}
