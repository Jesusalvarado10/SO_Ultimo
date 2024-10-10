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
    private int Computadores;
    private int ComputadoresE;
    private int compcount;
    
    public Almacen(){
        this.EspacioPlaca=0;
        this.EspacioCPU=0;
        this.EspacioRam=0;
        this.EspacioFuente=0;
        this.EspacioTarjeta=0;
        this.semaforo=new Semaphore(1);
        this.compcount=0;
    }
    
    public int EnviarPC(int ganancia,int gananciaE){
        int gananciaT=ganancia*this.Computadores+gananciaE*this.ComputadoresE;
        this.Computadores=0;
        this.ComputadoresE=0;
        return(gananciaT);
    }
    
    public void run(){
    }
    
    public void crearPC(int cpu,int fuente,int placa,int ram,int tarjeta,int comp){
        try{
            if((this.EspacioCPU>=cpu)&&(this.EspacioFuente>=fuente)&&(this.EspacioPlaca>=placa)&&(this.EspacioRam>=ram)){
            
                if((this.EspacioTarjeta>=tarjeta && tarjeta!=0 &&this.Computadores>=comp)){
                    System.out.println("El ensamblador esta entrando al almacen para una PC especial");
                    this.semaforo.acquire();
//                    System.out.println("El ensamblador ha entrado al almacen para una PC especial");
                    this.EspacioPlaca=this.EspacioPlaca-placa;
                    this.EspacioCPU=this.EspacioCPU-cpu;
                    this.EspacioRam=this.EspacioRam-ram;
                    this.EspacioFuente=this.EspacioFuente-fuente;
                    this.EspacioTarjeta=this.EspacioTarjeta-tarjeta;
                    this.compcount=this.compcount-comp;
                    this.ComputadoresE++;
//                    System.out.println("El ensamblador esta saliendo del almacen para una PC especial");
                    this.semaforo.release();
//                    System.out.println("El ensamblador ha salido del almacen para una PC especial");
                }else{
                    System.out.println("El ensamblador esta entrando al almacen para una PC");
                    this.semaforo.acquire();
//                    System.out.println("El ensamblador ha entrado al almacen para una PC");
                    this.EspacioPlaca=this.EspacioPlaca-placa;
                    this.EspacioCPU=this.EspacioCPU-cpu;
                    this.EspacioRam=this.EspacioRam-ram;
                    this.EspacioFuente=this.EspacioFuente-fuente;
                    this.Computadores++;
                    this.compcount++;
//                    System.out.println("El ensamblador esta saliendo del almacen para una PC");
                    this.semaforo.release();
//                    System.out.println("El ensamblador ha salido del almacen para una PC");
                }
        }
            
        }catch(InterruptedException e){}
        
    }
    
  
    
    public boolean Tarjetas(int tarjetas){
        if (this.EspacioTarjeta>=tarjetas){
            return(true);
        }else{
            return(false);
        }
    }
    
    public void almacenar(int empleadoID,String empleadotipo,int unidades){
        
        //Saber el deposito
        try {
            //Entrando al almacen
//            System.out.println("El empleado "+ empleadoID + " esta esperando en la fila al almacen");
            semaforo.acquire();
//            System.out.println("El empleado "+ empleadoID + " ha entrado al almacen");
            //Dentro del almacen
            switch (empleadotipo){
            case "Placa" -> {
                if (this.EspacioPlaca!=25) {
                    this.EspacioPlaca=this.EspacioPlaca+unidades;
//                    System.out.println("Placas en el almacen: " + this.EspacioPlaca);
                } else {
//                    System.out.println("No hay mas espacio para placas!!");
                }
            }
            case "CPU" -> {
                if (this.EspacioCPU!=20) {
                    this.EspacioCPU=this.EspacioCPU+unidades;
//                    System.out.println("CPUs en el almacen: " + this.EspacioCPU);
                } else {
//                    System.out.println("No hay mas espacio para CPUs!!");
                }
            }
            case "Ram" -> {
                if (this.EspacioRam!=55) {
                    this.EspacioRam=this.EspacioRam+unidades;
//                    System.out.println("Rams en el almacen: " + this.EspacioCPU);
                } else {
//                    System.out.println("No hay mas espacio para Rams!!");
                }
            }
            case "Fuente" -> {
                if (this.EspacioFuente!=35) {
                    this.EspacioFuente=this.EspacioFuente+unidades;
//                    System.out.println("Fuentes en el almacen: " + this.EspacioFuente);
                } else {
//                    System.out.println("No hay mas espacio para Fuentes de poder!!");
                }
            }
            case "Tarjeta" -> {
                if (this.EspacioTarjeta!=35) {
                    this.EspacioTarjeta=this.EspacioTarjeta+unidades;
//                    System.out.println("Tarjetas en el almacen: " + this.EspacioTarjeta);
                } else {
//                    System.out.println("No hay mas espacio para Tarjetas Graficas!!");
                }
            }
        }
            //Fuera del almancen
//            System.out.println("El empleado "+ empleadoID + " ha salido del almacen");
            semaforo.release();
            
        } catch (InterruptedException e){
            System.out.println("Algo paso en el almacen");
        }
        
    }
}
