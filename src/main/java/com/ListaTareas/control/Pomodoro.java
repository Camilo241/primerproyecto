package src.main.java.com.ListaTareas.control;
import java.util.Timer;
import java.util.TimerTask;

public class Pomodoro {
    private static final int WORK_DURATION = 25 * 60;  
    private static final int BREAK_DURATION = 5 * 60;  
    private Timer timer;
    private int remainingTime;
    private boolean isWorking;

    public Pomodoro() {
        remainingTime = WORK_DURATION;
        isWorking = true;
        createTimer();
    }

    private void createTimer() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                if (remainingTime > 0) {
                    remainingTime--;
                    displayTime();
                } else {
                    toggleTimerMode();
                }
            }
        }, 0, 1000); // Actualiza cada 1 segundo
    }

    private void toggleTimerMode() {
        isWorking = !isWorking;
        if (isWorking) {
            remainingTime = WORK_DURATION;
        } else {
            remainingTime = BREAK_DURATION;
        }
        displayTime();
    }

    private void displayTime() {
        int minutes = remainingTime / 60;
        int seconds = remainingTime % 60;
        System.out.printf("%02d:%02d - %s%n", minutes, seconds, isWorking ? "Trabajo" : "Descanso");
    }

    
}