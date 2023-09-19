package src.main.java.com.ListaTareas.control;
import java.util.Timer;
import java.util.TimerTask;

public class Pomodoro {
        private Timer timer;
        private int minutos;
        private boolean comienza;


    public Pomodoro(int minutes){
        this.minutos = minutos;
        this.timer = new Timer();
    }


    public void detener() {
        timer.cancel();
        comienza = false;
    }
}