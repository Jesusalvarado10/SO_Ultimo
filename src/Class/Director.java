/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author gabga
 */
public class Director extends Thread{
    ProyectManager PM;
    int DaysLeft;
    Empresa punteroEmpresa;
    public Director(ProyectManager PoM){
        this.PM=PoM;
        this.DaysLeft=11;
        this.punteroEmpresa=null;
    }
    
    public void contratar(Empresa empresa){
        this.punteroEmpresa=empresa;
    }
    public void run(){
        while (true){
            this.isAlive();
            if(this.DaysLeft<=0){
                System.out.println("El Director dice: Voy a vender ");
                this.punteroEmpresa.setGanancias(this.punteroEmpresa.accesoAlmacen().EnviarPC(this.punteroEmpresa.getGanancia(), this.punteroEmpresa.getGananciaE()));
                try{
                    Thread.sleep(2000);
                    this.DaysLeft=10;
                }catch(InterruptedException e){System.out.println("Algo paso con el director");}
            }
        } 
    }
    public void CountDays(){
        //Se pone al final de cada dia del PM para restarlo
        if(this.DaysLeft!=0){
            this.DaysLeft--;
            System.out.println("El Director dice: FALTAN " + this.DaysLeft + " DIAS!!");
        }
}
    
}
