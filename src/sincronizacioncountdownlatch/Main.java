package sincronizacioncountdownlatch;

// Librerías
import java.util.concurrent.CountDownLatch;

/**
 * Clase principal que ejecuta el resto de hilos para preparar el desayuno
 * 
 * @author davibern
 * @verion 1.0
 */
public class Main {

    /**
     * Método que inicia el programa
     * @param args argumentos en línea de comandos
     * @throws InterruptedException error de ejecución de CountDownLatch
     */
    public static void main(String[] args) throws InterruptedException {
        
        // Variables
        CountDownLatch latch = new CountDownLatch(3);           // Se crea el contador con la cantidad de hilos que tienen que ejecutarse hasta finalizar
        Thread hiloCafe = new HiloHacerCafe(latch);             // Hilo para hacer café
        Thread hiloZumo = new HiloHacerZumos(latch);            // Hilo para hacer zumo
        Thread hiloTostada = new HiloHacerTostadas(latch);      // Hilo para hacer tostada
        
        System.out.println("Preparando el desayuno...");
        
        hiloCafe.start();
        hiloZumo.start();
        hiloTostada.start();
        
        // Esperamos hasta que todos hayan finalizado
        latch.await();
        System.out.println("Desayuno servido.");
        
    }
    
}
