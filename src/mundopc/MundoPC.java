
package mundopc;

import es.com.mundopc.Raton;
import es.com.mundopc.Teclado;
import es.com.mundopc.Ordenador;
import es.com.mundopc.Monitor;
import es.com.mundopc.Ordenador;
import es.com.mundopc.Orden;

public class MundoPC {
    public static void main(String[] args) {
        Raton raton1 = new Raton("USB", "Logitech");
        Raton raton2 = new Raton("USB", "Razer");
        Raton raton3 = new Raton("PS/2", "Microsoft");
        
        Teclado teclado1 = new Teclado("USB", "Razer");
        Teclado teclado2 = new Teclado("USB", "Trust");
        Teclado teclado3 = new Teclado("PS/2", "Microsoft");
        
        Monitor monitor1 = new Monitor("Acer", 22);
        Monitor monitor2 = new Monitor("Samsung", 25);
        Monitor monitor3 = new Monitor("MSI", 32);
        
        Ordenador ordenador1 = new Ordenador ("Basic", monitor1, teclado3, raton3);
        Ordenador ordenador2 = new Ordenador ("Basic plus", monitor1, teclado2, raton1);
        Ordenador ordenador3 = new Ordenador ("Advanced", monitor2, teclado2, raton2);
        Ordenador ordenador4 = new Ordenador ("Pro", monitor3, teclado1, raton2);
        
        Orden orden1 = new Orden();
        orden1.agregarOrdenador(ordenador2);
   
        orden1.mostrarOrden();
    }
    
}
