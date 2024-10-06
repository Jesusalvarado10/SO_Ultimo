/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Class.Empresa;


public class ProyectManager extends Thread{
    private int Days;
    private Empresa Empresa;
    public ProyectManager(){
        this.Days=0;
        this.Empresa=null;
    }
    
    public int getDays(){
        return(this.Days);
    }
    
    public void contratar(Empresa empresa){
        this.Empresa=empresa;
    }
    
    @Override
    public void run(){
        while (true){
            this.Days++;
            //Comienzo del dia
            System.out.println("Dia " + this.Days);
            try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
                System.out.println("Error");
        }
    }
}
}
