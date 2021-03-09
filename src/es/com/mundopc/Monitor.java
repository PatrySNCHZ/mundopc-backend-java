/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.com.mundopc;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double pulgadas;
    private static int contadorMonitor;
    
    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitor;
    }
    
    public Monitor(String marca, double pulgadas){
        this();
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    public int getIdMonitor() {
        return idMonitor;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{idMonitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append(", pulgadas=").append(pulgadas);
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}
