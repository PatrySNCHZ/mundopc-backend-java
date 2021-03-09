
package es.com.mundopc;

public class Ordenador {

    public static int getContadorOrdenador() {
        return contadorOrdenador;
    }

    public static void setContadorOrdenador(int aContadorOrdenador) {
        contadorOrdenador = aContadorOrdenador;
    }
    private int idOrdenador;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private static int contadorOrdenador;
    
    private Ordenador(){
        this.idOrdenador = ++Ordenador.contadorOrdenador;
    }
    
    public Ordenador(String nombre, Monitor monitor, Teclado teclado, Raton raton){
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    
    }

    public int getIdOrdenador() {
        return idOrdenador;
    }

    public void setIdOrdenador(int idOrdenador) {
        this.idOrdenador = idOrdenador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ordenador{idOrdenador=").append(idOrdenador);
        sb.append(", nombre=").append(nombre);
        sb.append(", monitor=").append(monitor);
        sb.append(", teclado=").append(teclado);
        sb.append(", raton=").append(raton);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
    
}
