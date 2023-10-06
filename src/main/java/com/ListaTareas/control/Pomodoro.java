package src.main.java.com.ListaTareas.control;
import java.util.Timer;
import java.util.TimerTask;

public class Pomodoro {
    private static final int DURACION_TRABAJO = 25 * 60;  
    private static final int DURACION_DESCANSO = 5 * 60;  
    private Timer temporizador;
    private int tiempoRestante;
    private boolean enTrabajo;

    public Pomodoro() {
        tiempoRestante = DURACION_TRABAJO;
        enTrabajo = true;
        crearTemporizador();
    }

    private void crearTemporizador() {
        temporizador = new Timer();
        temporizador.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                if (tiempoRestante > 0) {
                    tiempoRestante--;
                    mostrarTiempo();
                } else {
                    cambiarModoTemporizador();
                }
            }
        }, 0, 1000); // Actualiza cada 1 segundo
    }

    private void cambiarModoTemporizador() {
        enTrabajo = !enTrabajo;
        if (enTrabajo) {
            tiempoRestante = DURACION_TRABAJO;
        } else {
            tiempoRestante = DURACION_DESCANSO;
        }
        mostrarTiempo();
    }


    private void mostrarTiempo() {
        int minutos = tiempoRestante / 60;
        int segundos = tiempoRestante % 60;
        System.out.printf("%02d:%02d - %s%n", minutos, segundos, enTrabajo ? "Trabajo" : "Descanso");
    }
}