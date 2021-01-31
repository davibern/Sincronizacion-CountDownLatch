package sincronizacioncountdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * Clase que hace la tostada para el desayuno.
 * Hereda de CountDownLatch
 * 
 * @author davibern
 * @version 1.0
 */
public class HiloHacerTostadas extends Thread {
    
    // Atributos
    private CountDownLatch latch;
    
    /**
     * Constructor de la clase
     * @param latch recibe un objeto de tipo CountDownLatch
     */
    public HiloHacerTostadas(CountDownLatch latch) {
        this.latch = latch;
    }
    
    /**
     * Método que ejecuta el hilo
     */
    @Override
    public void run() {
        System.out.println("Haciendo la tostada...");
        try {
            // Se duerme el hilo unos segundos para simular la preparación de la tostada (entre 3 segundo y 7 segundos
            Thread.sleep((long) (Math.random() * 3000 + 4000));
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Tostadas hechas.");
        // Se llama al hilo de untar tostadas en vez de avisar que se ha realizado la tarea
        // y será el hilo secundario cuado acabe cuando la de por terminada, en este caso los 
        // dos hilos, el de hacer tostadas y el de untarlas.
        new HiloUntarTostadas(latch).start();
    }
    
}
