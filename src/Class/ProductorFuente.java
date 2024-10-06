/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Class.Empleados;

/**
 *
 * @author gabga
 */
public class ProductorFuente extends Empleados {

     int ultimoNumeroCarnet;
     int capacidad;

    public ProductorFuente(int ultimoNumeroCarnet, int paga, int id, String tipo, Almacen almacen, int Unidades) {
        super(paga, id, tipo, almacen, Unidades);
        this.ultimoNumeroCarnet = ultimoNumeroCarnet;
        this.capacidad=35;
    }
    
       public int produccionDiaria() {
        if (ultimoNumeroCarnet >= 0 && ultimoNumeroCarnet < 3) {
            return 1 / 2;  // 1 CPU cada 2 días
        } else if (ultimoNumeroCarnet >= 3 && ultimoNumeroCarnet < 6) {
            return 1 / 3;  // 1 CPU cada 3 días
        } else {
            return 1 / 4;  // 1 CPU cada 4 días
        }
       }
    public void run(){
        this.chambear();
        this.refreshday();
    }
    
    public void refreshday(){
        this.ProduDay=this.PunteroAEmpresa.SolicitarPM().getDays();
    }
    
    public void chambear(){
        //int Days=this.PunteroAEmpresa.SolicitarPM().getDays();
        if (this.ProduDay==2){  
            //System.out.println("Soy el empleado" + this.ID +" y me voy por el dia "+this.ProduDay);
        this.ProduDay=0;
        this.Almacen.almacenar(this.ID,this.tipo,this.unidades);
        }
        if (this.ProduDay<2){
            this.ProduDay++;
        }
    }

}
