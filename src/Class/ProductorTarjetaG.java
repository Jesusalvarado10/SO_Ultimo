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
public class ProductorTarjetaG extends Empleados{
    int capacidad =10;
    int ultimoNumeroCarnet;
     public ProductorTarjetaG(int ultimoNumeroCarnet, int paga, int id, String tipo, Almacen almacen, int Unidades) {
        super(paga, id, tipo, almacen, Unidades);
        this.ultimoNumeroCarnet = ultimoNumeroCarnet;
    }
     
    public int produccionDiaria() {
        if (ultimoNumeroCarnet >= 0 && ultimoNumeroCarnet < 5) {
            return 1 / 3;  // 1 tarjeta gráfica cada 3 días
        } else {
            return 1 / 2;  // 1 tarjeta gráfica cada 2 días
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
