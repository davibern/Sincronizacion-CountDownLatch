package sincronizacioncountdownlatch;

// Librerías
import java.util.concurrent.CountDownLatch;

/**
 * Clase que hace el zumo para el desayuno.
 * Hereda de CountDownLatch
 * 
 * @author davibern
 * @version 1.0
 */
public class HiloHacerZumos extends Thread {
    
    // Atributos
    private CountDownLatch latch;
    
    /**
     * Constructor de la clase
     * @param latch recibe un objeto de tipo CountDownLatch
     */
    public HiloHacerZumos(CountDownLatch latch) {
        this.latch = latch;
    }
    
    /**
     * Método que ejecuta el hilo
     */
    @Override
    public void run() {
        System.out.println("Haciendo el zumo...");
        try {
            // Se duerme el hilo unos segundos para simular la preparación del zumo (entre 1 segundo y 3 segundos)
            Thread.sleep((long) (Math.random() * 2000 + 1000));
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Zumos hechos.");
        this.latch.countDown();
    }
    
}
