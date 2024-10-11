/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Class.Empresa;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author gabga
 */
public class ProyectManager extends Thread{
    private int Days;
    private Empresa Empresa;
    private boolean ViendoAnime;
    public ProyectManager(){
        this.Days=0;
        this.Empresa=null;
        this.ViendoAnime=false;
    }

    public boolean isViendoAnime() {
        return ViendoAnime;
    }
    
    public int getDays(){
        return(this.Days);
    }
    
    public void contratar(Empresa empresa){
        this.Empresa=empresa;
    }
    
    @Override
    public void run(){
        for (int i = 0; i<=Empresa.SolicitarPPlacas().length-1;i++){
                    this.Empresa.SolicitarPPlacas()[i].start();
                }
        for (int i = 0; i<=Empresa.SolicitarPCPU().length-1;i++){
                    this.Empresa.SolicitarPCPU()[i].start();
                }
        for (int i = 0; i<=Empresa.SolicitarPFuente().length-1;i++){
                    this.Empresa.SolicitarPFuente()[i].start();
                }
        for (int i = 0; i<=Empresa.SolicitarPRam().length-1;i++){
                    this.Empresa.SolicitarPRam()[i].start();
                }
        for (int i = 0; i<=Empresa.SolicitarPTarjeta().length-1;i++){
                    this.Empresa.SolicitarPTarjeta()[i].start();
                }
        this.Empresa.getEnsamblador().start();
        this.Empresa.SolicitarDirector().start();
        while (true){
            this.Empresa.SolicitarDirector().CountDays();
            try{
                //Primera hora del día
                
                System.out.println("Produccion para el dia: "+this.Days);
                for (int i = 1; i<=this.Empresa.SolicitarPPlacas().length-1;i++){
                    this.Empresa.SolicitarPPlacas()[i].sumardias();
                }
                this.ViendoAnime=true;
                Thread.sleep(170);
                this.ViendoAnime=false;
                for (int i = 0; i<=Empresa.SolicitarPPlacas().length-1;i++){
                    this.Empresa.SolicitarPPlacas()[i].sumardias();
                }
                this.ViendoAnime=true;
                Thread.sleep(170);
                this.ViendoAnime=false;
                for (int i = 0; i<=Empresa.SolicitarPCPU().length-1;i++){
                            this.Empresa.SolicitarPCPU()[i].sumardias();
                        }
                this.ViendoAnime=true;
                Thread.sleep(170);
                this.ViendoAnime=false;
                for (int i = 0; i<=Empresa.SolicitarPFuente().length-1;i++){
                            this.Empresa.SolicitarPFuente()[i].sumardias();
                        }
                this.ViendoAnime=true;
                Thread.sleep(170);
                this.ViendoAnime=false;
                for (int i = 0; i<=Empresa.SolicitarPRam().length-1;i++){
                            this.Empresa.SolicitarPRam()[i].sumardias();
                        }
                this.ViendoAnime=true;
                Thread.sleep(170);
                this.ViendoAnime=false;
                for (int i = 0; i<=Empresa.SolicitarPTarjeta().length-1;i++){
                            this.Empresa.SolicitarPTarjeta()[i].sumardias();
                        }
                this.ViendoAnime=true;
                Thread.sleep(170);
                this.ViendoAnime=false;
                Thread.sleep(978);
                
                this.Days++;
            } catch(InterruptedException e){

            }
//        while (true){
//            this.Days++;
//            //Comienzo del dia
//            System.out.println("Dia " + this.Days);
//            try{
//            Thread.sleep(1000);
//        } catch (InterruptedException e){
//                System.out.println("Error");
//        }
    }
}
}
