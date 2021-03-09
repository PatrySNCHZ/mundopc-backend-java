/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.com.mundopc;
import es.com.mundopc.Ordenador;

public class Orden {
    private int idOrden;
    private Ordenador ordenadores[];
    private static int contadorOrdenes;
    private int contadorOrdenadores;
    private static final int MAX_ORDENADORES=1;
    
    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.ordenadores = new Ordenador[Orden.MAX_ORDENADORES];
    }
    
    public void agregarOrdenador(Ordenador ordenador){
        if(this.contadorOrdenadores < Orden.MAX_ORDENADORES){
            this.ordenadores[contadorOrdenadores++] = ordenador;
        }else{
            System.out.println("Se ha producido un error. Máximo de pedidos alcanzado o superado. Max pedidos" + Orden.MAX_ORDENADORES);
        }
    }
    
    public void mostrarOrden(){
        System.out.println("Su pedido es el siguiente");
        System.out.println("ID Orden= " + this.idOrden);
        System.out.println("Productos de la orden:");
        for(int i= 0; i < this.contadorOrdenadores; i++){
            System.out.println(ordenadores[i]);
        }
        
        
    }
    
    
}
