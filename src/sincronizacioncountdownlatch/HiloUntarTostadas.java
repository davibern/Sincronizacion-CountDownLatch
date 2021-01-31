package sincronizacioncountdownlatch;

// Librerías
import java.util.concurrent.CountDownLatch;

/**
 * Clase que hace la tostada para el desayuno.
 * Hereda de CountDownLatch
 * Este hilo se ejecutará desde HiloHacerTostadas
 * 
 * @author davibern
 * @version 1.0
 */
public class HiloUntarTostadas extends Thread {
    
    // Atributos
    private CountDownLatch latch;
    
    /**
     * Constructor de la clase
     * @param latch recibe un objeto de tipo CountDownLatch
     */
    public HiloUntarTostadas(CountDownLatch latch) {
        this.latch = latch;
    }
    
    /**
     * Método que ejecuta el hilo
     */
    @Override
    public void run() {
        System.out.println("Untando las tostadas");
        try {
            // Se duerme el hilo unos segundos para simular untar la tostada (entre 1 segundo y 3 segundos)
            Thread.sleep((long) (Math.random() * 1000 + 1000));
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Tostadas untadas.");
        this.latch.countDown();
    }
}
