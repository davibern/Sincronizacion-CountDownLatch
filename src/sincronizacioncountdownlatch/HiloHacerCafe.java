package sincronizacioncountdownlatch;

// Librerías
import java.util.concurrent.CountDownLatch;

/**
 * Clase que hace el café para el desayuno.
 * Hereda de CountDownLatch
 * 
 * @author david
 * @version 1.0
 */
public class HiloHacerCafe extends Thread {
    
    // Atributos
    private CountDownLatch latch;
    
    /**
     * Constructor de la clase
     * @param latch recibe un objeto de tipo CountDownLatch
     */
    public HiloHacerCafe(CountDownLatch latch) {
        this.latch = latch;
    }
    
    /**
     * Método que ejecuta el hilo
     */
    @Override
    public void run() {
        System.out.println("Haciendo el café...");
        try {
            // Se duerme el hilo unos segundos para simular la preparación del café (entre 1 segundo y 4 segundos
            Thread.sleep((long) (Math.random() * 3000 + 1000));
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Café hecho");
        this.latch.countDown();
    }
    
}
