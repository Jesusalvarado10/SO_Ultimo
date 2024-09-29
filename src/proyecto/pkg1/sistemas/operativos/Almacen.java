/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.pkg1.sistemas.operativos;
import java.util.concurrent.Semaphore;
/**
 *
 * @author gabga
 */
public class Almacen {
    private int EspacioPlaca;
    private int EspacioRam;
    private int EspacioTarjeta;
    private int EspacioFuente;
    private int EspacioCPU;
    private final Semaphore semaforo;
    
    public Almacen(){
        this.EspacioPlaca=0;
        this.EspacioCPU=0;
        this.EspacioRam=0;
        this.EspacioFuente=0;
        this.EspacioTarjeta=0;
        this.semaforo=new Semaphore(1);
    }
    
    public void run(){
    }
    public void almacenar(int empleadoID,String empleadotipo,int unidades){
        
        //Saber el deposito
        try {
            //Entrando al almacen
            System.out.println("El empleado "+ empleadoID + " esta esperando en la fila al almacen");
            semaforo.acquire();
            System.out.println("El empleado "+ empleadoID + " ha entrado al almacen");
            //Dentro del almacen
            switch (empleadotipo){
            case "Placa" -> {
                if (this.EspacioPlaca!=25) {
                    this.EspacioPlaca=this.EspacioPlaca+unidades;
                    System.out.println("CPUs en el almacen: " + this.EspacioPlaca);
                } else {
                    System.out.println("No hay mas espacio para placas!!");
                }
            }
            case "CPU" -> {
                if (this.EspacioCPU!=20) {
                    this.EspacioCPU=this.EspacioCPU+unidades;
                    System.out.println("CPUs en el almacen: " + this.EspacioCPU);
                } else {
                    System.out.println("No hay mas espacio para CPUs!!");
                }
            }
            case "Ram" -> {
                if (this.EspacioRam!=55) {
                    this.EspacioRam=this.EspacioRam+unidades;
                    System.out.println("CPUs en el almacen: " + this.EspacioCPU);
                } else {
                    System.out.println("No hay mas espacio para Rams!!");
                }
            }
            case "Fuente" -> {
                if (this.EspacioFuente!=35) {
                    this.EspacioFuente=this.EspacioFuente+unidades;
                    System.out.println("CPUs en el almacen: " + this.EspacioFuente);
                } else {
                    System.out.println("No hay mas espacio para Fuentes de poder!!");
                }
            }
            case "EspacioTarjeta" -> {
                if (this.EspacioTarjeta!=35) {
                    this.EspacioTarjeta=this.EspacioTarjeta+unidades;
                    System.out.println("CPUs en el almacen: " + this.EspacioTarjeta);
                } else {
                    System.out.println("No hay mas espacio para Tarjetas Graficas!!");
                }
            }
        }
            //Fuera del almancen
            System.out.println("El empleado "+ empleadoID + " ha salido del almacen");
            semaforo.release();
            
        } catch (InterruptedException e){
            System.out.println("Algo paso en el almacen");
        }
        
    }
    public void despachar(int X){
        
    }
}
