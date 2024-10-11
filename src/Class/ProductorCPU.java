/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Class.Empleados;
import Class.Almacen;

/**
 *
 * @author gabga
 */
public class ProductorCPU extends Empleados{
    
    int days;
    public ProductorCPU(int id,Almacen almacen,int CI) {
        super(26, id,"CPU",almacen);
          if (CI >= 0 && CI < 3) {
            days = 2; // 1 CPU cada 2 días
            this.unidades=1;
        } else if (CI >= 3 && CI < 6) {
            System.out.print("entro5");
            days = 3; // 1 CPU cada 3 días
            this.unidades=1;
        } else{
            days = 4; // 1 CPU cada 4 días
        this.unidades=1;
        }
          
    }
    
     public void run(){
        while(true){
            this.isAlive(); //Literalmente el archivo del coco de TFT2
           if(this.diaspro>=days){
                this.Almacen.almacenar(this.ID, this.tipo, this.unidades);
                this.reiniciardias();
            }
        }
    }
    
    public void refreshday(){
        this.ProduDay=this.PunteroAEmpresa.SolicitarPM().getDays();
    }
    
    public void chambear(){
        //int Days=this.PunteroAEmpresa.SolicitarPM().getDays();
        if (this.ProduDay>2){  
            System.out.println("Soy el empleado" + this.ID +" y me voy por el dia "+this.ProduDay);
        this.ProduDay=0;
        this.Almacen.almacenar(this.ID,this.tipo,this.unidades);
        }
        if (this.ProduDay<2){
            this.ProduDay++;
        }
    }
}
